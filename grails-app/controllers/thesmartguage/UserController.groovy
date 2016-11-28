package thesmartguage

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class UserController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    static stateConstantMap = [AB : "Abia", AD : "Adamawa", AI : "Akwa Ibom", AS : "Anambra State", BA : "Bauchi", BY : "Bayelsa", BE : "Benue", BO : "Borno", CR : "Cross River", DE : "Delta", EB : "Ebonyi", ED : "Edo", EK : "Ekiti", EN : "Enugu", GO : "Gombe", IM : "Imo", JI : "Jigawa", KA : "Kaduna", KN : "Kano", KT : "Katsina", KB : "Kebbi", KO : "Kogi", KW : "Kwara", LA : "Lagos", NA : "Nasarawa", NI : "Niger", OG : "Ogun", ON : "Ondo", OS : "Osun", OY : "Oyo", PL : "Plateau", RI : "Rivers", SO : "Sokoto", TA : "Taraba", YO : "Yobe", ZA : "Zamfara"]
    static ministryConstantMap = [MD : "Minister of Defence", ME : "Minister of Education", MEV : "Minister of Environment", MF : "Minister of Finance", MFA : "Minister of Foreign Affairs", MH : "Minister of Health", MI : "Minister of Information", MIT : "Minister of Interior", MJ : "Minister of Justice &amp; Attorney-General", MN : "Minister of Niger Delta", MST : "Minister of Science and Technology", MSM : "Minister of Solid Minerals", MSA : "Minister of State, Aviation", MP : "Minister of Power, Works and Housing", MB : "Minister of Budget &amp; National Planning", MTI : "Minister of Trade, Investment &amp; Industry", MC : "Minister of Communication", MFCT : "Minister FCT", MA : "Minister of Agriculture", ML : "Minister of Labour &amp; Employment", MT : "Minister of Transportation", MYS : "Minister for Youth and Sports", MWR : "Minister of Water Resources", MWA : "Minister of Women Affairs"]

    def templateModel(){

    }

    def homeTemplate(){
        render(template: 'homeTemplate')
    }

    def aboutTsgTemplate(){
        render(template: 'tsgTemplate')
    }

    def ministerTemplate(){
        def mstName = params.mstName
        def ministerDetails = MinistryDetails?.findByMinistryDesignation(ministryConstantMap?.get(mstName))
        render(template: 'ministryPageTemplate', model:[md: ministerDetails])
    }

    def concernsTemplate(){
        render(template: 'concernsTemplate')
    }

    def contactsTemplate(){
        render(template: 'contactsTemplate')
    }

    def stateTemplate(){
        def stateName = params.stateName
        println '----stateName----'+stateName
        def stateDetails = StateDetails?.findByStateName(stateConstantMap?.get(stateName))
        println '----StateDetails-----'+stateDetails.stateName
        render(template: 'stateTemplate', model: [sd: stateDetails])
    }

    def saveConcerns(){
        def concernInstance = new Concerns(name : params.userName, email: params.email, phone: params.phone, category: params.category, subject: params.subject, message: params.msg)
        concernInstance.save(flush: true)
        render(template: 'concernsTemplate')
    }

    def renderSavedConcerns(){
        def concernsInstance = Concerns.get(1)
    }

    def userSystemLogin(){
        def userInstance = User.findByUserNameAndPassword(params.userName, params.password)
        if(userInstance) render("Successfully logged in")
        else render("Unsuccessful attempt")
    }

    def userSystemRegistration(){
        def newUserInstance = new User(userName: params.userName, password: params.password, email: params.email, phone: params.phone, city: params.city, state: params.state, firstName: params.firstName, lastName: params.lastName, LGA: params.lga, dob: params.dob, webSite: params.website, roleInstance: Role.findByType("U"))
        newUserInstance.save(flush: true)
        if(newUserInstance.id) render("Successfully registered")
        else render("Unsuccessful attempt")
    }

    def login(){
        render(view: 'login')
    }

    def aboutTsg(){
        render(view: 'aboutTsg')
    }

    def test(){
        println '---user role ---'+User?.get(2).userName
        render (view: 'test')
    }

    def ministryPage(){
//        def ministryDetails = MinistryDetails.findByMinistryDesignation('Ministry of Defence');
        println '---- in ministry page----'
        render(view: 'ministryPage')
    }

    def statePage(){
        println '---- in statePage----'
        render(view: 'statePage')
    }

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond User.list(params), model: [userInstanceCount: User.count()]
    }

    def show(User userInstance) {
        respond userInstance
    }

    def create() {
        respond new User(params)
    }

    @Transactional
    def save(User userInstance) {
        if (userInstance == null) {
            notFound()
            return
        }

        if (userInstance.hasErrors()) {
            respond userInstance.errors, view: 'create'
            return
        }

        userInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'user.label', default: 'User'), userInstance.id])
                redirect userInstance
            }
            '*' { respond userInstance, [status: CREATED] }
        }
    }

    def edit(User userInstance) {
        respond userInstance
    }

    @Transactional
    def update(User userInstance) {
        if (userInstance == null) {
            notFound()
            return
        }

        if (userInstance.hasErrors()) {
            respond userInstance.errors, view: 'edit'
            return
        }

        userInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'User.label', default: 'User'), userInstance.id])
                redirect userInstance
            }
            '*' { respond userInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(User userInstance) {

        if (userInstance == null) {
            notFound()
            return
        }

        userInstance.delete flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'User.label', default: 'User'), userInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'user.label', default: 'User'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
