object CommonSequenceMethod extends App {
    val nums = (1 to 10).toList
    val names = List("joel", "ed", "chris", "maurice")
    println("----------------------------map----------------------------")
    println(nums.map(_ * 2))
    println(names.map(_.capitalize))

    println("----------------------------filter----------------------------")
    println(nums.filter(_ < 5))
    println(names.filter(_.length <= 4))

    println("----------------------------foreach----------------------------")
    nums.filter(_ < 4).foreach(println)

    println("----------------------------head/tail----------------------------")
    println(nums.head)
    println(nums.tail)
    println(names.head)
    println(names.tail)
    println("foo".head)
    println("foo".tail)

    println("----------------------------take/takeWhile----------------------------")
    println(nums.take(1))
    println(names.take(2))
    println(nums.takeWhile(_ < 5))
    println(names.takeWhile(_.length < 5))

    println("----------------------------drop/dropWhile----------------------------")
    println(nums.drop(1))
    println(names.drop(2))
    println(nums.dropWhile(_ < 5))
    println(names.dropWhile(_.length < 5))

    println("----------------------------reduce----------------------------")
    def add(x: Int, y: Int): Int = {
        val theSum = x + y
        println(s"received $x and $y, their sum is $theSum")
        theSum
    }
    val a = List(1,2,3,4)
    println(a.reduce(add))
    println((1 to 10).toList.reduce(_ + _))


}