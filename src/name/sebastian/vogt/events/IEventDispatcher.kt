package name.sebastian.vogt.events

interface IEventDispatcher {

    fun addEventListener(type: String, listener: ((e: Event)->Unit)): Boolean
    fun removeEventListener(type: String): Boolean
    fun hasEventListener(type: String): Boolean
    fun dispatchEvent(e: Event)
}