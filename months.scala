import scala.io.StdIn.readInt

object exercise {
    def main(args : Array[String]) : Unit = {
        val vowelsList = List('a', 'e', 'i', 'o', 'u') 
        print("Enter a month number: ")
        val month = readInt()
        month match {
            case 1  => println("January")
            case 2  => println("February")
            case 3  => println("March")
            case 4  => println("April")
            case 5  => println("May")
            case 6  => println("June")
            case 7  => println("July")
            case 8  => println("August")
            case 9  => println("September")
            case 10 => println("October")
            case 11 => println("November")
            case 12 => println("December")
            case _ => print("not a valid grade")
        }
    }
}
