import scala.util.matching.Regex
import scala.io.StdIn._
object RegularExpression1 {
  def main(args: Array[String]): Unit = {
    println("Welcome to User Registration")
    val firstLastNamePattern= "^[A-Z]{1,}[a-z]{3,}$"
    val emailPattern = "^[^\\.][a-z0-9\\.\\-+]+@[a-z0-9]{1,}\\.[a-z]{2,3}(\\.[a-z]{2,3})?$"
    val mobileNumberPattern = ("^([0-9]{2,3})\\s{1}[0-9]{10}")
    val passwordPattern = "^(?=.*?[A-Z])(?=.*?[a-z(?=.*?[0-9])])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$"
    var firstName = readLine("Enter First Name:")
    var firstNameCheck = validatePattern(firstLastNamePattern, firstName)
    var lastName = readLine("Enter Last Name:")
    var lastNameCheck = validatePattern(firstLastNamePattern, lastName)
    var emailid = readLine("Enter an Email:")
    var emailIdCheck = validatePattern(emailPattern, emailid)
    var mobileNumber = readLine("Enter Mobile Number:")
    var mobileNumberCheck = validatePattern(mobileNumberPattern, mobileNumber)
    var password = readLine("Enter your Password:")
    var passwordCheck = validatePattern(passwordPattern, password)
  }
  def validatePattern(pattern: String, temp1: String): Boolean = {
    var tempData: String = "";
    tempData = temp1
    while (tempData.matches(pattern) == false) {
      tempData = readLine("Please enter correct data :")
    }
    println("Inserted details accepted.")
    println("User Registration is successful")

    return true
  }
}