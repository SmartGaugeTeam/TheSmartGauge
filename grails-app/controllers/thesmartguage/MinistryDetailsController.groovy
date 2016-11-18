package thesmartguage



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class MinistryDetailsController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond MinistryDetails.list(params), model:[ministryDetailsInstanceCount: MinistryDetails.count()]
    }

    def show(MinistryDetails ministryDetailsInstance) {
        respond ministryDetailsInstance
    }

    def create() {
        respond new MinistryDetails(params)
    }

    @Transactional
    def save(MinistryDetails ministryDetailsInstance) {
        if (ministryDetailsInstance == null) {
            notFound()
            return
        }

        if (ministryDetailsInstance.hasErrors()) {
            respond ministryDetailsInstance.errors, view:'create'
            return
        }

        ministryDetailsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'ministryDetails.label', default: 'MinistryDetails'), ministryDetailsInstance.id])
                redirect ministryDetailsInstance
            }
            '*' { respond ministryDetailsInstance, [status: CREATED] }
        }
    }

    def edit(MinistryDetails ministryDetailsInstance) {
        respond ministryDetailsInstance
    }

    @Transactional
    def update(MinistryDetails ministryDetailsInstance) {
        if (ministryDetailsInstance == null) {
            notFound()
            return
        }

        if (ministryDetailsInstance.hasErrors()) {
            respond ministryDetailsInstance.errors, view:'edit'
            return
        }

        ministryDetailsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'MinistryDetails.label', default: 'MinistryDetails'), ministryDetailsInstance.id])
                redirect ministryDetailsInstance
            }
            '*'{ respond ministryDetailsInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(MinistryDetails ministryDetailsInstance) {

        if (ministryDetailsInstance == null) {
            notFound()
            return
        }

        ministryDetailsInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'MinistryDetails.label', default: 'MinistryDetails'), ministryDetailsInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'ministryDetails.label', default: 'MinistryDetails'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
