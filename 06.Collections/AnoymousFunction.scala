object AnoymousFunction extends App {
    val ints = List(1,2,3)
    println("------------------Anoymous Function with map------------------")
    println(ints.map(_ * 2))
    println(ints.map((i: Int) => i * 2))
    println(ints.map(i => i * 2))
    println(for (i <- ints) yield i * 2)

    println("------------------Anoymous Function with filter------------------")
    val ints2 = List.range(1, 10)
    println(ints2.filter(_ > 5))
    println(ints2.filter(_ % 2 == 0))
    println(ints2.filter((i: Int) => i % 3== 0))
    println(ints2.filter(i => i % 4== 0))
}