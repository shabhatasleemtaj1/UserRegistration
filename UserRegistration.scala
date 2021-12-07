//Use case2 
import scala.util.matching.Regex
import scala.io.StdIn._
object RegularExpression1 {
  def main(args: Array[String]): Unit = {
    println("Welcome to User Registration")
    val firstLastNamePattern= "^[A-Z]{1,}[a-z]{3,}$"
    var firstName = readLine("Enter First Name:")
    var firstNameCheck = validatePattern(firstLastNamePattern, firstName)
    var lastName = readLine("Enter Last Name:")
    var lastNameCheck = validatePattern(firstLastNamePattern, lastName)
  }
  def validatePattern(pattern: String, temp1: String): Boolean = {
    var tempData: String = "";
    tempData = temp1
    while (tempData.matches(pattern) == false) {
      tempData = readLine("Please enter correct data :")
    }
    println("Inserted details accepted.")
    return true
  }
}