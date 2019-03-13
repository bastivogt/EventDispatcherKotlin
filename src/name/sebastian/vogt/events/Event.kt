package name.sebastian.vogt.events

open class Event(type: String, source: Any) {
    var type = type
        protected set
    var source = source
        protected set
}