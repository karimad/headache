package healer

import medication.*

class Doctor {

    fun gimmeMyMeds(prescription: Prescription) : Medication {
        when(prescription) {
            Prescription.HEADACHE -> return Paracetamol()
            Prescription.FEVER -> return Ibuprofene()
            Prescription.FAKEIT -> return Placebo()
        }
    }
}