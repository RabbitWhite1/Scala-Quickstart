import scala.collection.mutable.Map

object CollectionMapAndSet extends App {
    println("----------------------------Map----------------------------")
    val states = Map(
        "AK" -> "Alaska",
        "IL" -> "Illinois",
        "KY" -> "Kentucky"
    )
    states += ("AL" -> "Alabama")
    states ++= List("AR" -> "Arkansas", "AZ" -> "Arizona")
    println(states)
    states ++= Map("CA" -> "California", "CO" -> "Colorado")
    println(states)
    states -= "AR"
    states --= List("AL", "AZ")
    states --= List("AL", "AZ")
    println(states)
    for ((k,v) <- states) println(s"key: $k, value: $v")

    println("----------------------------Set----------------------------")
    val set = scala.collection.mutable.Set[Int]()
    set += 1
    set += 2 += 3
    set ++= Vector(4, 5)
    println(set)
    println(set.add(6))
    println(set.add(5))
    println(set)
    set -= 1
    set -= 2 -= 3
    set --= Array(4, 5)
    println(set)
    set.clear
    println(set)
    set ++= List(1, 2, 3, 4, 5, 6)
    println(set.remove(2))
    println(set.remove(40))

}