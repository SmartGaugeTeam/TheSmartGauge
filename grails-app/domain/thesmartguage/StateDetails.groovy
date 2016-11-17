package thesmartguage

class StateDetails {

    String firstName
    String lastName
    String fullName
    String ministryDesignation
    String bio
    String mandate
    String imageName

    static mapping = {
        bio type: "text"
        mandate type: "text"
    }

    static constraints = {
    }
}
