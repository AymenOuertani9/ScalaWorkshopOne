import scala.io.StdIn.readChar

object exercise {
    def main(args : Array[String]) : Unit = {
        val vowelsList = List('a', 'e', 'i', 'o', 'u') 
        print("Enter a grade: ")
        val grade = readChar()
        grade match {
            case ('A' | 'a') => print("Exellent")
            case ('B' | 'b') => print("good job")
            case ('C' | 'C') => print("keep it up")
            case ('D' | 'd') => print("You need to improve")
            case ('F' | 'f') => print("failed")
            case _ => print("not a valid grade")
        }
    }
}
