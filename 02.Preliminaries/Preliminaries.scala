import scala.io.StdIn.readLine

object Preliminaries extends App {
    val firstName = "John"
    val mi = 'C'
    val lastName = "Doe"

    // precede `s`
    val name = s"$firstName $mi $lastName" // Ruby-like way to merge Strings
    val two = s"1+1 = ${1+1}"

    // precede `f`
    val height = 1.9d
    println(f"$name%s is $height%2.2f meters tall")
    
    // 多行字符串
    print("""faew
fsadg
gawegw""")

    // 命令行输出
    println("Hello, world!")
    print("Hello, world!")
    System.err.println("An error happened")

    // 命令行输入
    println("Input sth.:")
    val in = readLine
    print(s"we get $in")
}