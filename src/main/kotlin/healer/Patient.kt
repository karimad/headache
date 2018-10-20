package healer

import medication.Medication

class Patient {
    fun ask(pharmacy: Pharmacy, prescription: Prescription): Medication {
        val medication = pharmacy.gimmeMyMeds(prescription)
        return medication
    }
}