package thesmartguage

class StateDetails {

    String stateName
    String firstName
    String lastName
    String fullName
    String ministryDesignation
    String bio
    String mandate
    String imageName
    String partySymbol

    static mapping = {
        bio type: "text"
        mandate type: "text"
    }

    static constraints = {
    }
}
