package medication

class Ibuprofene : Medication {

    override val name:String = "Ibuprofene"
    override val posology:Int = 6
    override val nbDays:Int = 2

    constructor() : super()
}