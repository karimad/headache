import medication.Doctor
import medication.Pharmacy
import medication.Prescription
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

fun main(args :Array<String>) {

    val kodein = Kodein {
        bind<Pharmacy>() with singleton { Pharmacy() }
        bind<Doctor>() with singleton { Doctor() }
    }

    val pharmacy:Pharmacy by kodein.instance()
    val doctor:Doctor by kodein.instance()

    println(pharmacy.ask(doctor, Prescription.HEADACHE).healMe())

    println(pharmacy.ask(doctor, Prescription.FAKEIT).healMe())

    println(pharmacy.ask(doctor, Prescription.FEVER).healMe())
}