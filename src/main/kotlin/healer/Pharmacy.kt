package healer

import medication.Medication

class Pharmacy {
    fun ask(doctor: Doctor, prescription: Prescription): Medication {
        val medication = doctor.gimmeMyMeds(prescription)
        return medication
    }
}