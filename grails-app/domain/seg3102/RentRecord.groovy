package seg3102

import java.sql.Time

class RentRecord {

    String emailAddress
    double rent
    Date rentalDate
    Time rentalTime

    static hasOne = [property: Property, customer: Customer]

    static constraints = {
    }
}
