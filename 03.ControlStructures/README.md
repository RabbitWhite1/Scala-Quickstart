# Constrol Structures

## if/else

```scala
if (a == 1) {
    println("1")
} else if (a == 2) {
    println("2")
} else {
    println("else")
}
```

## for Loops

```scala
// for Loops
//// for with Seq and List
val nums = Seq(1,2,3)
for (n <- nums) println(n)
val sth = List("Bill", "Hank", 1, true)
for (i <- sth) println(i)
//// for with Map
val ratings = Map(
    "Lady in the Water"  -> 3.0, 
    "Snakes on a Plane"  -> 4.0, 
    "You, Me and Dupree" -> 3.5
)
////// for
for ((name,rating) <- ratings) println(s"Movie: $name, Rating: $rating")
////// foreach
ratings.foreach {
    case(movie, rating) => println(s"key: $movie, value: $rating")
}
```

## for Expression

```scala
// for Expressions
val doubledNums = for (n <- nums) yield n * 2
println(doubledNums)
val names = List("adam", "david", "frank")
val capNames = for (name <- names) yield {
    val nameWithoutUnderscore = name.drop(1)
    val capName = nameWithoutUnderscore.capitalize
    capName
}
println(capNames)
```

## match

```scala
// match
val i = 6
i match {
    case x if 1 to 20 contains x => println("1 to 20")
    case 1 | 3  => println("odd")
    case 2 | 4  => println("even")
    case x if x > 5 => println("more than five")
    case _ => println("some other number")
}

def convertBooleanToStringMessage(bool: Boolean): String = bool match {
    case true => "you said true"
    case false => "you said false"
}
println(convertBooleanToStringMessage(true))
println("--------------------------------------------")
```

## try-catch

```scala
try{
    // ...
} catch {
    case e: FileNotFoundException => println("Couldn't find that file.")
    case e: IOException => println("Had an IOException trying to read that file")
} finally {
    // ...
}