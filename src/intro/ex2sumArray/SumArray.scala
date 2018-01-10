package intro.ex2sumArray

object Solution {

  def simpleArraySum(ar: Array[Int]): Int =  {
    ar.fold (0) { (a,b) => a+b } //ar.sum resolve it too
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt()
    var ar = new Array[Int](n)
    for(ar_i <- 0 to n-1) {
      ar(ar_i) = sc.nextInt()
    }
    val result = simpleArraySum(ar)
    println(result)
  }
}
