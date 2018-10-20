package medication

class Paracetamol : Medication {

    override val name:String = "Paracetamol"
    override val posology:Int = 4
    override val nbDays:Int = 1

    constructor() : super()
}