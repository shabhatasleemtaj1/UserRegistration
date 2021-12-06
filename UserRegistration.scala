import scala.util.matching.Regex
import scala.io.StdIn._
object RegularExpression1 {
  def main(args: Array[String]): Unit = {
    println("Welcome to User Registration")
    var FirstName=readLine("Enter First Name:")
    val FirstNamepattern ="^[A-Z]{1,}[a-z]{3,}$".r
    if(FirstNamepattern.matches(FirstName))
    {
      println("FirstName is valid:")
    }
    else
    {
      println("FirstName is not valid")
    }
  }

}
//usecase2
import scala.util.matching.Regex
import scala.io.StdIn._
object RegularExpression1 {
  def main(args: Array[String]): Unit = {
    println("Welcome to User Registration")
    val FirstNamepattern = "^[A-Z]{1,}[a-z]{3,}$".r
    val LastNamepattern = "^[A-Z]{1,}[a-z]{3,}$".r
    var FirstName = readLine("Enter First Name:")
    if (FirstNamepattern.matches(FirstName)) {
      println("FirstName is valid:")
    }
    else {
      println("FirstName is not valid)
    }
    var LastName = readLine("Enter Last Name:")
    if (LastNamepattern.matches(LastName)) {
      println("LastName is valid:")
    }
    else {
      println("LastName is not valid")
    }
  }
}


