import org.koin.dsl.module.module
import org.koin.standalone.StandAloneContext.startKoin

/**
 * A class to hold our message data
 */


data class HelloMessageData(val message: String = "Hello Koin")

val helloModule = module{
    single { HelloMessageData()}

    single { HelloServiceImpl(get()) as HelloService}
}

fun main(vararg args: String){

    startKoin(listOf(helloModule))

    HelloApplication().sayHello()
}