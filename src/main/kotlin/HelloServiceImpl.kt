/**
 * Hello Service Impl
 * Will use HelloMessageData data
 */

class HelloServiceImpl(private val helloMessageData: HelloMessageData): HelloService {

    override fun hello(): String = "Hey, ${helloMessageData.message}"

}