package seg3102

class Property {

    String type
    int numBedrooms
    int numBathrooms
    int numOtherRooms
    double rent
    boolean deleteStatus

    static hasOne = [address: Address]
    static hasMany = [history: History, visitingList: VisitingList, rentRecord: RentRecord]

    static constraints = {
    }
}
