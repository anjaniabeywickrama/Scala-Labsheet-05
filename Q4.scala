package Labsheet05
import scala.io.StdIn

object Q4 {

  def main(args: Array[String]): Unit= {
    print("Enter the number: ")
    val n= StdIn.readInt()

    println(determine(n))

  }
  def determine(n1: Int): String= n1 match{
    case n1 if(n1==0) => "Even number"
    case n1 if(n1==1) => "Odd number"
    case n1 if(n1<0) => determine(n1+2)
    case _ => determine(n1-2)

  }

}
