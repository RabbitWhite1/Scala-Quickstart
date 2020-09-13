trait TailWagger {
    def startTail(): Unit
    def stopTail(): Unit = println("tail is stopped")
}

trait Speaker {
    def speak(): String = "woof!"
}

trait Runner {
    def startRunning(): Unit
    def stopRunning(): Unit = println("Stopped running")
}

class Dog extends TailWagger with Speaker with Runner {
    // the implemented methods
    // Speaker
    // override def speak(): String = "Woof!"

    // TailWagger
    def startTail(): Unit = println("tail is wagging")
    // def stopTail(): Unit = println("tail is stopped")

    // Runner
    //  with or not ": Unit" are both ok
    def startRunning(): Unit = println("I'm running")
    override def stopRunning() = println("Stopped running!!!")
}

object Traits extends App {
    println("-------------------dog1-------------------")
    val d1 = new Dog
    d1.startTail()
    d1.stopTail()
    d1.startRunning()
    d1.stopRunning
    println("-------------------dog2-------------------")
    val d2 = new Dog with Speaker
    d2.startTail()
    d2.stopTail()
    println(d2.speak())
    d2.startRunning()
    d2.stopRunning
}