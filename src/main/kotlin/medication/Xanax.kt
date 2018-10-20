package medication

class Xanax : Medication {

    override val name:String = "Xanax"
    override val posology:Int = 6
    override val nbDays:Int = 2

    constructor() : super()
}