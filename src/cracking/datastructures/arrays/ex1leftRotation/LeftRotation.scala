package cracking.datastructures.arrays.ex1leftRotation

import java.util.Scanner

object Solution {

  def main(args: Array[String]): Unit = {

    // Constraints = 1 < n < 10^6. Is viable to make copies even on slow devices. (just a few KB of ram)
    // It this was a problem a Memory bound solution would be make small step rotations applying this N
    // times with steps of one.

    val input = new Scanner(System.in)

    val n = input.nextInt()
    val d = input.nextInt()

    val originalArray = new Array[Integer](n)

    (0 until n).foreach(i => originalArray(i) = input.nextInt())

    val rotatedArray = originalArray.drop(d) ++ originalArray.take(d)

    println(rotatedArray.mkString(" "))

  }

}
