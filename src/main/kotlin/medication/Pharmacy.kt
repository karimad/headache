package medication

import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

class Pharmacy {

    fun ask(doctor: Doctor):Medication {
        val medication = doctor.gimmeMyMeds("P")
        return medication
    }

}