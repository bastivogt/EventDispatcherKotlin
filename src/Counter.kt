import name.sebastian.vogt.events.EventDispatcher

class Counter(start: Int = 0, end: Int = 10, step: Int = 1) : EventDispatcher() {

    var start = start
        private set

    var end = end
        private set
    var step = step
        private set

    var count = 0
        private set


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