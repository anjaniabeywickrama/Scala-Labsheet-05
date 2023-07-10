package Labsheet05
import scala.io.StdIn

object Q3 {

  def main(args: Array[String]): Unit= {
    println("Enter the number: ")
    val n= StdIn.readInt()
    println("Sum of numbers from 1 to " +n +": " +sum(n))

  }
  def sum(n1:Int, n2:Int=1): Int= {
    if(n1<0){
      return 0;
    }
    else {
      return n1+sum(n1-1)
    }
  }

}
