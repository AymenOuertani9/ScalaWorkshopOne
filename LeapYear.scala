import scala.io.StdIn.readInt

object exercise {
    def main(args : Array[String]) : Unit = {
        print("Enter a year: ")
        val year = readInt()
        if (year % 4 == 0 & year % 100 != 0){
            print("Leap year")
        } else {
        print("Not leap year")
        }
    }
}
