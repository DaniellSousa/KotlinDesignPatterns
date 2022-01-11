package creational

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ComponentTest {

    @Test
    fun builderTest() {
        val component = Component.Builder()
            .setParam1("a string")
            .setParam3(true)
            .build()

        println(component)
        println(component.param1)
        println(component.param2)
        println(component.param3)

        Assertions.assertEquals("a string", component.param1)
        Assertions.assertEquals(null, component.param2)
        Assertions.assertEquals(true, component.param3)
    }
}