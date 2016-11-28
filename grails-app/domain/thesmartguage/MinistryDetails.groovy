package thesmartguage

class MinistryDetails {

    String firstName
    String lastName
    String fullName
    String ministryDesignation
    String bio
    byte[] mandate
    String imageName
    String q1
    String q2
    String q3
    String q4
    String q5

    static mapping = {
        bio type: "text"
        mandate type: "text"
    }

    static constraints = {
    }
}
