package medication

abstract class Medication {
    abstract val name: String
    abstract val posology : Int
    abstract val nbDays: Int

    fun giveMe() = """Give me a $name with a posology of $posology caps per $nbDays days"""
}