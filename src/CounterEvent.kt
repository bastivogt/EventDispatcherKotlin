import name.sebastian.vogt.events.Event

open class CounterEvent(type: String, source: Any) : Event(type, source) {

    companion object {
        val COUNTER_START = "onCounterStart"
        val COUNTER_CHANGE = "onCounterChange"
        val COUNTER_FINISH = "onCounterFinish"
    }



}