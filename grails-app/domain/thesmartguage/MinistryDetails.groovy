package thesmartguage

class MinistryDetails {

    String firstName
    String lastName
    String fullName
    String ministryDesignation
    String bio
    byte[] mandate
    String imageName

    static mapping = {
        bio type: "text"
        mandate type: "text"
    }

    static constraints = {
    }
}
