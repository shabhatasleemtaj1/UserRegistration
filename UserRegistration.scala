//use case 4
import scala.util.matching.Regex
import scala.io.StdIn._
object RegularExpression1 {
  def main(args: Array[String]): Unit = {
    println("Welcome to User Registration")
    val FirstLastNamePattern = "^[A-Z]{1,}[a-z]{3,}$".r
    val EmailPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,3})$".r
    val MobileNumberPattern=("^([0-9]{2,3})\\s{1}[0-9]{10}").r
    var FirstName = readLine("Enter First Name:")
    if (FirstLastNamePattern.matches(FirstName)) {
      println("First Name is valid")
    }
    else {
      println("First name is invalid")
    }
    var LastName = readLine("Enter Last Name:")
    if (FirstLastNamePattern.matches(LastName)) {
      println("Last Name is valid")
    }
    else {
      println("Last name is invalid")
    }
    var Email = readLine("Enter an Email:")
    if (EmailPattern.matches(Email)) {
      println("Email is valid")
    }
    else {
      println("Email is invalid")
    }
    var MobileNumber=readLine("Enter Mobile Number:")
    if(MobileNumberPattern.matches(MobileNumber))
    {
      println("MobileNumber is valid:")
    }
    else
    {
      println("MobileNumber is not valid")
    }
  }
}