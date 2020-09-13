# Trait And Abstract Class

## Trait

```scala
trait Speaker {
    def speak(): String = "woof!"
}
```

- Just like java's interface
- Extends multi-traits by `extends trait1 with trait2 with trait3`
- Override method by `override def method1...`
- `trait`s can be mix on the fly. `new Dog() with Speaker

## Abstract Class

```scala
abstract class Pet (name: String) {
    def speak(): Unit = println("Yo")   // concrete implementation
    def comeToMaster(): Unit            // abstract method
}
```

- Why need this? `trait` don't support constructor parameter
- A class can extend only **one** abstract class
- Use `abstract class` if you need to call Scala code from Java code
- 