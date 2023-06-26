import scala.io.StdIn.readInt

object exercise {
    def main(args : Array[String]) : Unit = {
        print("Enter an age: ")
        val age = readInt()
        if (age < 18){
            print("you are a minor")
        } else {
        print("you are an adult")
        }
    }
}
