package exercises.ex1

object Solution {

  def main(args: Array[String]) {

    val scanner = io.Source.stdin.getLines().take(2).map(_.toInt)

    val a = scanner.next()
    val b = scanner.next()

    println(a+b)
  }
}