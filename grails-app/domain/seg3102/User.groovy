package seg3102

class User {

    String givenName
    String lastName
    String userName
    Date creationDate
    boolean deleted

    static constraints = {
        userName unique: true
    }
}
