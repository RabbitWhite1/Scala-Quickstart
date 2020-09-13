abstract class Pet (name: String) {
    def speak: Unit = println(s"My name is $name")   // concrete implementation
    def comeToMaster(): Unit            // abstract method
}

class Dog(name: String) extends Pet(name) {
    //override def speak() = println("Woof")
    def comeToMaster() = println("Here I come!")
}

object AbstractClass extends App {
    println("-------------------dog Rover-------------------")
    val rover = new Dog("Rover")
    rover.speak
    rover.comeToMaster()
}