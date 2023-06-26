import scala.io.StdIn.readInt

object exercise {
    def main(args : Array[String]) : Unit = {
        print("Enter a number: ")
        val number = readInt()
        if (number <= 1)
            print("the number is not prime")
        else if (number == 2)
            print("the number is prime")
        else {
            if(!(2 until number).exists(n => number % n == 0) == true){
                print("the number is prime")
            } else {
                print("the number is not prime")
            }
        }
    }
}
