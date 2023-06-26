import scala.io.StdIn.readInt
import scala.math.pow


object exercise {
    def main(args : Array[String]) : Unit = {
        print("Enter a number of three digits: ")
        val number = readInt()
        val first_digit = number / 100
        val second_digit = (number / 10) % 10
        val third_digit = number % 10
        if (pow(first_digit , 3) + pow(second_digit , 3) + pow(third_digit , 3) == number){
            print("the number is armastrong number")
        } else {
            print("number is not armastrong number")
        }
    }
}
