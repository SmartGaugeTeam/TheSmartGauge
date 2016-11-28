package thesmartguage

import grails.transaction.Transactional

import static org.springframework.http.HttpStatus.CREATED
import static org.springframework.http.HttpStatus.NOT_FOUND
import static org.springframework.http.HttpStatus.NO_CONTENT
import static org.springframework.http.HttpStatus.OK

class HomeController {

    def templateModel(){

    }

    def homeTemplate(){
        render(template: 'homeTemplate')
    }

    def aboutTsgTemplate(){
        render(template: 'tsgTemplate')
    }

    def ministerTemplate(){
        //def mstName = params.mstName
        //def ministerDetails = MinistryDetails.findByMinistryDesignation(smartGauge.MinistryConstants?.MD)//get(1);
        def ministerDetails = MinistryDetails.get(1);
        render(template: 'ministryPageTemplate', model:[md: ministerDetails])
    }

    def concernsTemplate(){
        render(template: 'concernsTemplate')
    }

    def contactsTemplate(){
        render(template: 'contactsTemplate')
    }

    def stateTemplate(){
        def stateDetails = StateDetails.get(1);
        render(template: 'stateTemplate', model: [sd: stateDetails])
    }

    def login(){
        render(view: 'login')
    }

    def aboutTsg(){
        render(view: 'aboutTsg')
    }

    def test(){
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
