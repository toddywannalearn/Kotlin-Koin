import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

/**
 * HelloAppliction - Appliction Class
 * use HelloService
 */

class HelloApplication : KoinComponent {

    // Inject HelloService
    val helloService by inject<HelloService>()

    // display our data
    fun sayHello() = println(helloService.hello())
}