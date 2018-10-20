package medication

abstract class Medication {
    abstract val name: String
    abstract val posology : Int
    abstract val nbDays: Int

    open fun healMe() = """Take a $name with a posology of $posology caps per $nbDays day(s)"""
}