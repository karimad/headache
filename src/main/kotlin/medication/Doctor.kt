package medication

import java.lang.IllegalArgumentException

class Doctor {

    fun gimmeMyMeds(s: String) : Medication {
        when(s) {
            "D" -> return Doliprane()
            "X" -> return Xanax()
        }
        throw IllegalArgumentException("no meds found")
    }
}