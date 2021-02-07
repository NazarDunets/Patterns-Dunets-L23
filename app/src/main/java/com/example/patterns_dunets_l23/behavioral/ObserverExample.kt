package com.example.patterns_dunets_l23.behavioral

fun main() {

    val dataSource = DataSource()

    val mockListener = MockListener()

    dataSource.events.subscribe(mockListener)
}
class EventManager {

    private val listeners = mutableListOf<EventListener>()

    fun subscribe(listener: EventListener) {
        listeners.add(listener)
    }

    fun unsubscribe(listener: EventListener) {
        listeners.remove(listener)
    }

    fun notify(data: String) {
        listeners.forEach{ it.update(data) }
    }
}

interface EventListener {

    fun update(data: String)
}

class DataSource {

    val events = EventManager()
    private var data = "foobar"

    fun changeData(newData: String) {
        data = newData
        events.notify(data)
    }
}

class MockListener: EventListener {

    private var dataOnScreen = "FOO"

    override fun update(data: String) {
        dataOnScreen = data
        displayNewData()
    }

    private fun displayNewData() {}
}