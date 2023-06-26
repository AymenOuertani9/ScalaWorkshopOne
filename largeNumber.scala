import scala.io.StdIn.readLine

object exercise {
    def main(args : Array[String]) : Unit = {
        print("Enter your first number: ")
        val first_number = readLine()
        print("Enter your second number: ")
        val second_input = readLine()
        val MaxValue2 = if (first_number < second_input) second_input else first_number
        print("The large number is" + MaxValue2)
        }
}
