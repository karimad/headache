package medication

import java.lang.IllegalArgumentException

class Doctor {

    fun gimmeMyMeds(s: String) : Medication {
        when(s) {
            "P" -> return Paracetamol()
            "I" -> return Ibuprofene()
        }
        throw IllegalArgumentException("you're not sick")
    }
}