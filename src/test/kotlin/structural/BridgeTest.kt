package structural

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BridgeTest {
    @Test
    fun testBridge() {
        val tv = TV()
        val radio = Radio()

        val tvRemote = BasicRemote(tv)
        val radioRemote = BasicRemote(radio)

        tvRemote.volumeUp()
        tvRemote.volumeUp()
        tvRemote.volumeDown()

        radioRemote.volumeUp()
        radioRemote.volumeUp()
        radioRemote.volumeUp()
        radioRemote.volumeDown()

        Assertions.assertEquals(1, tv.volume)
        Assertions.assertEquals(2, radio.volume)
    }
}

