# A Taste of Scala

## Compile and Run

```shell
scala Hello.scala
scala -cp . Hello # here "-cp ." means the classpath
```

## Or Directly Run

```shell
scala Hello.scala
```

## The Scala REPL

Run Scala REPL by
```shell
scala
```

It's like an `Explainer`.

## Variables

### Immutable/Mutable

- `val`: for immutable variables
- `var`: for mutable variables 

### Specify Variable Types

Without specifying:
```scala
val x = 1
val s = "a string"
```
With specifying:
```scala
val x: Int = 1
val s: String = "a string"
val p: Person = new Person("Hanl")
```

## Match

```scala
val result = i match {
    case 1 => "one"
    case 2 => "two"
    case _ => "not 1 or 2"
}
```