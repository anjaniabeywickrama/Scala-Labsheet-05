package Labsheet05
import scala.io.StdIn

object Q6 {


  def main(args: Array[String]): Unit = {
    print("Enter the number: ")
    val n = StdIn.readInt()

    fibonacciSeq(n)

  }
  def fibonacci(n1: Int): Int = n1 match{
    case n1 if(n1==0) => 0
    case n1 if(n1==1) => 1
    case _ => fibonacci(n1-1) + fibonacci(n1-2)
  }

  def fibonacciSeq(n1: Int):Unit = {
    if(n1>0){
      fibonacciSeq(n1-1)
      print(",")
    }
    print(fibonacci(n1))
  }

}
