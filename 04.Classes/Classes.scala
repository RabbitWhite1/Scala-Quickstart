object Classes extends App {
    // Class
    println("-----------------------Class-----------------------")
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

    // Method
    println("-----------------------Method-----------------------")
    def addThenDouble(a: Int, b: Int): Int = {
        val sum = a + b
        val doubled = sum * 2
        doubled
    }
    println(addThenDouble(1, 1))
    
    // Enumerations
    println("-----------------------Enumerations-----------------------")
    import scala.collection.mutable.ArrayBuffer
    
    sealed trait Topping
    case object Cheese extends Topping
    case object Pepperoni extends Topping
    case object Sausage extends Topping
    case object Mushrooms extends Topping
    case object Onions extends Topping

    val toppings = ArrayBuffer[Topping]()
    toppings += Cheese
    toppings += Onions
    println(toppings)
    toppings -= Onions
    println(toppings)
    
}