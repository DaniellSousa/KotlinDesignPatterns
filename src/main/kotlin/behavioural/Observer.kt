package behavioural

import java.io.File

/*
* Design Pattern Observer: Este é um design pattern relacionado a notificação de mudança de estado/valor de um objeto. Com
*                       ele pode-se criar "assinantes" da variável/objeto a serem notificados.
*
* Design Pattern Observer: This is a design pattern related to an object's state/value change notification. With
*                       it can create "subscribers" of the variable/object to be notified.
*
* */

object Constants {
    val SAVE_EVENT_TYPE = "save"
    val OPEN_EVENT_TYPE = "open"
}

interface EventListener {
    fun update(eventType: String?, file: File?)
}

class EventManager(vararg operations: String) {
    var listeners = hashMapOf<String, ArrayList<EventListener>>()

    init {
        for (operation in operations) {
            listeners[operation] = ArrayList<EventListener>()
        }
    }

    fun subscribe(eventType: String?, listener: EventListener) {
        val users = listeners.get(eventType)
        users?.add(listener)
    }

    fun unsubscribe(eventType: String?, listener: EventListener) {
        val users = listeners.get(eventType)
        users?.remove(listener)
    }

    fun notify(eventType: String?, file: File?) {
        val users = listeners.get(eventType)
        users?.let { listenersNotify ->
            for (listener in listenersNotify) {
                listener.update(eventType, file)
            }
        }
    }
}

class Editor {
    var events = EventManager(Constants.OPEN_EVENT_TYPE, Constants.SAVE_EVENT_TYPE)
    private var file: File? = null

    fun openFile(filePath: String) {
        file = File(filePath)
        events.notify(Constants.OPEN_EVENT_TYPE, file)
    }

    fun saveFile() {
        file?.let {
            events.notify(Constants.SAVE_EVENT_TYPE, file)
        }
    }
}

class EmailNotificationListener(private val email: String): EventListener {
    override fun update(eventType: String?, file: File?) {
        println("Email to $email: Someone has performed $eventType operation with the file ${file?.name}")
    }
}

class LogOpenListener(var filename: String): EventListener {
    override fun update(eventType: String?, file: File?) {
        println("Save to log $filename: Someone has performed $eventType operation with the file ${file?.name}")
    }
}

