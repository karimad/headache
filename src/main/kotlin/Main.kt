import healer.Pharmacy
import healer.Patient
import healer.Prescription
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

fun main(args :Array<String>) {

    val kodein = Kodein {
        bind<Patient>() with singleton { Patient() }
        bind<Pharmacy>() with singleton { Pharmacy() }
    }

    val patient: Patient by kodein.instance()
    val pharmacy: Pharmacy by kodein.instance()

    println(patient.ask(pharmacy, Prescription.HEADACHE).healMe())

    println(patient.ask(pharmacy, Prescription.FAKEIT).healMe())

    println(patient.ask(pharmacy, Prescription.FEVER).healMe())
}