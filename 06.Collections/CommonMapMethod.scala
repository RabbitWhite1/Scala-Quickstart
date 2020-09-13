import scala.collection.mutable.Map

object CommonSequenceMethod extends App {
    val m = Map(
        1 -> "a", 
        2 -> "b", 
        3 -> "c",
        4 -> "d"
    )
    for ((k,v) <- m) printf("key: %s, value: %s\n", k, v)
    println("-----------------keys-----------------")
    println(m.keys)
    println("-----------------values-----------------")
    println(m.values)
    println("-----------------contains-----------------")
    println(m.contains(3))
    println("-----------------transform-----------------")
    println(m.transform((k,v) => v.toUpperCase))
    println("-----------------filterKeys-----------------")
    println(m.view.filterKeys(Set(2,3)).toMap)
    println("-----------------take-----------------")
    // take the first two
    println(m.take(2))
    println("-----------------retain-----------------")
    println(m.retain((k,v) => k >= 3))
}