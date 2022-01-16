package behavioural

import org.junit.jupiter.api.Test

class ObserverTest {

    @Test
    fun testObserver() {
        val editor = Editor()

        val logListener = LogOpenListener("path/to/log/file.txt")
        val emailListener = EmailNotificationListener("test@tes.com.br")

        editor.events.subscribe(Constants.OPEN_EVENT_TYPE, logListener)
        editor.events.subscribe(Constants.OPEN_EVENT_TYPE, emailListener)
        editor.events.subscribe(Constants.SAVE_EVENT_TYPE, emailListener)

        editor.openFile("test.txt")
        editor.saveFile()
    }
}