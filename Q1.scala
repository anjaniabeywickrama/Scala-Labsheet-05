package Labsheet05
import scala.io.StdIn

object Q1 {

  def main(args: Array[String]): Unit = {
    print("Enter the number: ")
    val n = StdIn.readInt()
    println(prime(n))

  }

  def prime(n1: Int, n2: Int = 2): Any = n1 match {
    case n1 if (n1 < 2) => false
    case n1 if (n1 == n2) => true
    case n1 if (n1 % n2 == 0) => false
    case _ => prime(n1,n2+1)
  }

}
