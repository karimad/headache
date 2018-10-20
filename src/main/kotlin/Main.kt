import medication.Doctor
import medication.Pharmacy
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

    print(pharmacy.ask(doctor).medicate())
}