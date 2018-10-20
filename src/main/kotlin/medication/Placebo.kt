package medication

class Placebo: Medication {
    override val name:String = ""
    override val posology:Int = 0
    override val nbDays:Int = 0

    constructor() : super()

    override fun healMe() = """Go back to work !! You're not sick"""
}