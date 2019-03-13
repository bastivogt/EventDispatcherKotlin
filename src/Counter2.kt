import name.sebastian.vogt.events.Event
import name.sebastian.vogt.events.EventDispatcher
import name.sebastian.vogt.events.IEventDispatcher

class Counter2(start: Int = 0, end: Int = 10, step: Int = 1) : IEventDispatcher {


    var start = start
        private set

    var end = end
        private set
    var step = step
        private set

    var count = 0
        private set

    private val ed = EventDispatcher()

    var listeners = ed.listeners
        private set



    override fun addEventListener(type: String, listener: (e: Event) -> Unit): Boolean {
        return ed.addEventListener(type, listener)
    }

    override fun removeEventListener(type: String): Boolean {
        return ed.removeEventListener(type)
    }

    override fun hasEventListener(type: String): Boolean {
        return ed.hasEventListener(type)
    }

    override fun dispatchEvent(e: Event) {
        ed.dispatchEvent(e)
    }


    fun run() {
        //println("start")
        dispatchEvent(CounterEvent(CounterEvent.COUNTER_START, this))

        for(i: Int in start..end) {
            count = i
            //println("change")
            dispatchEvent(CounterEvent(CounterEvent.COUNTER_CHANGE, this))

        }
        //println("finish")
        dispatchEvent(CounterEvent(CounterEvent.COUNTER_FINISH, this))


    }

    fun reset(start: Int = 0, end: Int, step: Int = 1) {
        this.start = start
        this.end = end
        this.step = step
        this.count = 0
    }



}