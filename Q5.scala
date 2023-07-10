package Labsheet05
import scala.io.StdIn

object Q5 {

  def main(args: Array[String]): Unit= {

    print("Enter the number: ")
    val n = StdIn.readInt()
    println("Sum of all even numbers less than " +n+ ": " +AddEven(n-1))

  }
  //only get sum of even numbers from 1 to less than given number
  def IsEven(n1: Int): Boolean = n1 match{
    case n1 if(n1==1) => false
    case n1 if(n1==0) => true
    case _ => IsEven(n1-2)
  }

  def AddEven(n1: Int): Int = n1 match{
    case n1 if(n1==0) => 0
    case n1 if IsEven(n1) => n1 + AddEven(n1-2)
    case _ => AddEven(n1-1)
  }


}
