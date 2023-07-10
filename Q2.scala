package Labsheet05
import scala.io.StdIn

object Q2 {

  def main(args: Array[String]): Unit = {
    print("Enter the number: ")
    val n = StdIn.readInt()
    println("prime numbers up to " + n + " :")
    primeSeq(n - 1)

  }

  def prime(n1: Int, n2: Int = 2): Boolean = n1 match {
    case n1 if (n1 < 2) => false
    case n1 if (n1 == n2) => true
    case n1 if (n1 % n2 == 0) => false
    case _ => prime(n1, n2 + 1)

  }

  def primeSeq(n1: Int): Unit = {
    if (n1 == 2) {
      print(n1)
    }
    else {
      primeSeq(n1 - 1)
      if (prime(n1))
        print("," + n1)
    }
  }

}

