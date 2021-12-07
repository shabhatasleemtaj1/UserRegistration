import scala.util.matching.Regex
import scala.io.StdIn._
object RegularExpression1 {
  def main(args: Array[String]): Unit = {
    println("Welcome to User Registration")
    val firstLastNamePattern= "^[A-Z]{1,}[a-z]{3,}$"
    val emailPattern = "^[^\\.][a-z0-9\\.\\-+]+@[a-z0-9]{1,}\\.[a-z]{2,3}(\\.[a-z]{2,3})?$"
    var firstName = readLine("Enter First Name:")
    var firstNameCheck = validatePattern(firstLastNamePattern, firstName)
    var lastName = readLine("Enter Last Name:")
    var lastNameCheck = validatePattern(firstLastNamePattern, lastName)
    var emailid = readLine("Enter an Email:")
    var emailIdCheck = validatePattern(emailPattern, emailid)
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