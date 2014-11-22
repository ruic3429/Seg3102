package seg3102

class CreditCard {

    String type
    //We would never apply an integer operation on credit
    //card therefore it would be easier to manage as a string
    String number
    String cardHolder
    String expiryMonth
    String expiryYear

    static constraints = {
    }
}
