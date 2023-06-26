import scala.io.StdIn.readInt

object exercise {
    def main(args : Array[String]) : Unit = {
        print("Enter your first number: ")
        val first_number = readInt()
        print("Enter your second number: ")
        val second_input = readInt()
        print("Enter your third number: ")
        val third_input = readInt()
        val MaxValue = if (first_number < second_input) second_input else first_number
        print(MaxValue)
        val MaxValue2 = if (MaxValue < third_input) third_input else MaxValue
        print("The large number is " + MaxValue2)
        }
}
