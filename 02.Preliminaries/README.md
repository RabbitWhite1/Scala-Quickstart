# Preliminaries

## 常量表示

### 字符串

#### 字符串的引用

```scala
val firstName = "John"
val mi = 'C'
val lastName = "Doe"

// precede `s`
val name = s"$firstName $mi $lastName" // Ruby-like way to merge Strings
val two = s"1+1 = ${1+1}"

// precede `f`
val height = 1.9d
val name = "James"
println(f"$name%s is $height%2.2f meters tall") 
```

#### 多行字符串
```scala
"""faew
fsadg
gawegw"""
```

### Scala的空值

Scala的空值是`scala.Null`类型.

## 变量声明

### 常量

```scala
val a: String = "a"
val b = "b"
val x, y = 100 // 则x和y都声明为100
```

### 变量

```scala
var a: String = "a"
var b = "b"
```

## 命令行IO

### 输出

```scala
println("Hello, world!")
print("Hello, world!")
System.err.println("An error happened")
```

### 输入

```scala
import scala.io.StdIn.readLine
val firstName = readLine()
```