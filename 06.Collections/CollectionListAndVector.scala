object CollectionListAndVector extends App {
    println("------------------List------------------")
    val a = List[Int](1, 2, 3)
    println(a :+ 4)    
    println(0 +: a)
    println(a ++ List[String]("Jack", "Hank", "Shirley"))

    println("------------------Vector------------------")
    val b = Vector[Int](1, 2, 3)
    println(b :+ 4)    
    println(0 +: b)
    println(b ++ Vector[String]("Jack", "Hank", "Shirley"))
}