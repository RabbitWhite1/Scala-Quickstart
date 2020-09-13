# Classes

## Class Features

- `val` for read-only field
- statement of `class` is the constructor itself
- auxiliary constructor is defined like `def this(num: Int) = {this(...)}`

sample code:
```scala
class Person(var firstName: String = "Stupid", val lastName: String) { // val makes field read-only
    println("the constructor begins")

    // 'public' access by default
    var age = 0

    // some class fields
    private val HOME = System.getProperty("user.home")

    // auxiliary class constructor
    def this(num: Int) = {
        this(num.toString(), num.toString())
    }
            
    // some methods
    override def toString(): String = s"$firstName $lastName is $age years old"

    def printHome(): Unit = println(s"HOME = $HOME")    
    def printFullName(): Unit = println(this) 

    printHome()
    printFullName()
    println("you've reached the end of the constructor")
}
val p = new Person(lastName="White")
println(p.firstName + " " + p.lastName)
println()
val p1 = new Person(1)
println(p1.firstName + " " + p1.lastName)
```

## Method

```scala
def addThenDouble(a: Int, b: Int): Int = {
    val sum = a + b
    val doubled = sum * 2
    doubled
}
println(addThenDouble(1, 1))
```

## Enumerations

```scala
sealed trait DayOfWeek
case object Sunday extends DayOfWeek
case object Monday extends DayOfWeek
case object Tuesday extends DayOfWeek
case object Wednesday extends DayOfWeek
case object Thursday extends DayOfWeek
case object Friday extends DayOfWeek
case object Saturday extends DayOfWeek
```