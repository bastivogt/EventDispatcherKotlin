import name.sebastian.vogt.events.Event

fun main(args: Array<String>) {
    println("Hallo!")

    val c = Counter()


/*    val counterStart = fun(e: Event) {
        val counter = e.source as Counter
        println("${e.type} ${counter.count}")
    }

    c.addEventListener(CounterEvent.COUNTER_START, counterStart)*/

/*    c.addEventListener(CounterEvent.COUNTER_START)  {
        println(CounterEvent.COUNTER_START)
    }*/

    //c.addEventListener(CounterEvent.COUNTER_START, ::onStart)

    c.addEventListener(CounterEvent.COUNTER_START)  {e ->
        val counter = e.source as Counter
        println("${e.type} ${counter.count}")
    }



/*    c.addEventListener(CounterEvent.COUNTER_START, fun(e) {
        val counter = e.source as Counter
        println("${e.type} ${counter.count}")
        //counter.removeEventListener(CounterEvent.COUNTER_CHANGE)
        //onStart(e)
    })*/

    c.addEventListener(CounterEvent.COUNTER_CHANGE, fun(e) {
        val counter = e.source as Counter
        println("${e.type} ${counter.count}")
    })

    c.addEventListener(CounterEvent.COUNTER_FINISH, fun(e) {
        val counter = e.source as Counter
        println("${e.type} ${counter.count}")
    })


    c.run()

    /*val c2 = Counter2()



    c2.addEventListener(CounterEvent.COUNTER_START, fun(e) {
        val counter = e.source as Counter2
        println("${e.type} ${counter.count}")
        //counter.removeEventListener(CounterEvent.COUNTER_CHANGE)
    })

    c2.addEventListener(CounterEvent.COUNTER_CHANGE, fun(e) {
        val counter = e.source as Counter2
        println("${e.type} ${counter.count}")
    })

    c2.addEventListener(CounterEvent.COUNTER_FINISH, fun(e) {
        val counter = e.source as Counter2
        println("${e.type} ${counter.count}")
    })


    c2.run()*/
}


fun onStart(e: Event) {
    val counter = e.source as Counter
    println("${e.type} ${counter.count}")
}

