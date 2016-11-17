package thesmartguage


import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class StateDetailsController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond StateDetails.list(params), model: [stateDetailsInstanceCount: StateDetails.count()]
    }

    def show(StateDetails stateDetailsInstance) {
        respond stateDetailsInstance
    }

    def create() {
        respond new StateDetails(params)
    }

    @Transactional
    def save(StateDetails stateDetailsInstance) {
        if (stateDetailsInstance == null) {
            notFound()
            return
        }

        if (stateDetailsInstance.hasErrors()) {
            respond stateDetailsInstance.errors, view: 'create'
            return
        }

        stateDetailsInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'stateDetails.label', default: 'StateDetails'), stateDetailsInstance.id])
                redirect stateDetailsInstance
            }
            '*' { respond stateDetailsInstance, [status: CREATED] }
        }
    }

    def edit(StateDetails stateDetailsInstance) {
        respond stateDetailsInstance
    }

    @Transactional
    def update(StateDetails stateDetailsInstance) {
        if (stateDetailsInstance == null) {
            notFound()
            return
        }

        if (stateDetailsInstance.hasErrors()) {
            respond stateDetailsInstance.errors, view: 'edit'
            return
        }

        stateDetailsInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'StateDetails.label', default: 'StateDetails'), stateDetailsInstance.id])
                redirect stateDetailsInstance
            }
            '*' { respond stateDetailsInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(StateDetails stateDetailsInstance) {

        if (stateDetailsInstance == null) {
            notFound()
            return
        }

        stateDetailsInstance.delete flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'StateDetails.label', default: 'StateDetails'), stateDetailsInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'stateDetails.label', default: 'StateDetails'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
