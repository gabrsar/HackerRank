package exercises.ex3

/**
 * https://www.hackerrank.com/challenges/fp-hello-world-n-tim
 *
 * Problem Statement
 *
 * Print "Hello World" N times. The input portion will be handled automatically.
 * You need to write a function with the recommended method signature.
 *
 * Input Format
 * An Integer N which is the number of times we need to print "Hello World".
 * Output Format
 * N lines, each containing "Hello World".
 * Constraints
 * 0<=N<=50
 *
 * Sample Input
 *
 * 4
 *
 * Sample Output
 *
 * Hello World
 * Hello World
 * Hello World
 * Hello World
 *
 * Recommended Method Signature
 *
 * Number Of Parameters: 1
 * Parameters: [n]
 * Returns: nil
 *
 * For Hackers Using Scala
 * This will be the outline of your function body (fill up the blank portion marked by underscores):
 *
 * def f(n: Int) = ______________________
 *
 */

object Solution {

  def f(n:Int) = for (i <- 1 to n) {println("Hello World")}

  def main(args: Array[String]) {

    val scanner = io.Source.stdin.getLines().take(1).map(_.toInt)

    val times = scanner.next()

    f(times)
  }
}