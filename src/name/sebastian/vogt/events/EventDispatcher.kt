package name.sebastian.vogt.events

open class EventDispatcher : IEventDispatcher {
    var listeners = hashMapOf<String, ((Event)->Unit)>()
        private set



    override fun addEventListener(type: String, listener: ((Event) -> Unit)): Boolean {
        if(!listeners.containsKey(type)) {
            listeners[type] = listener
            return true
        }
        return false
    }


    override fun removeEventListener(type: String): Boolean {
        if(listeners.containsKey(type)) {
            listeners.remove(type)
            return true
        }
        return false
    }

    override fun hasEventListener(type: String): Boolean {
        return listeners.containsKey(type)
    }


    override fun dispatchEvent(e: Event) {
        if(listeners.containsKey(e.type)) {
            //listeners[e.type]!!(e)
            listeners[e.type]?.invoke(e)
        }
    }





}