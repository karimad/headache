package medication

class Doliprane : Medication {

    override val name:String = "Doliprane"
    override val posology:Int = 4
    override val nbDays:Int = 1

    constructor() : super()
}