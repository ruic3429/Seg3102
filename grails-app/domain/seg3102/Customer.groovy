package seg3102

class Customer extends User{

    static hasOne = [visitingList: VisitingList, creditCard: CreditCard]
    static hasMany = [rentRecord: RentRecord]

    static constraints = {
    }
}
