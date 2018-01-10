package intro.ex1sumTwoNumbers

object Solution {

  def main(args: Array[String]) {

    val result = io.Source.stdin.getLines()
      .take(2)
      .map(_.toInt)
      .sum

    println(result)
  }
}
