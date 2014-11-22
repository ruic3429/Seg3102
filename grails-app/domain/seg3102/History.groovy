package seg3102

class History {

    String startMonth
    String endMonth
    int monthVisits
    int reportingVisits

    static belongsTo = [property: Property]

    static constraints = {
    }
}
