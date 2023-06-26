import scala.io.StdIn.readInt

object exercise {
    def main(args : Array[String]) : Unit = {
        print("Enter a number: ")
        val number = readInt()
        if ((number).compare(0) > 0){
            print("The number is positive")
        } else if((number).compare(0) < 0){
            print("The number is negative")
        } else {
        print("The number is 0")
        }
    }
}
