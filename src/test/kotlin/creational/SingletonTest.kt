package creational

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SingletonTest {
    @Test
    fun testSingleton() {
        val networkDriver1 = NetworkDriver.log()
        val networkDriver2 = NetworkDriver.log()

        Assertions.assertEquals(NetworkDriver, networkDriver1)
        Assertions.assertEquals(NetworkDriver, networkDriver2)

        // both instances are same of the class NetworkDriver
    }
}