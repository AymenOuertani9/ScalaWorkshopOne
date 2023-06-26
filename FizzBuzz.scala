import scala.io.StdIn.readInt

object exercise {
    def main(args : Array[String]) : Unit = {
        print("Enter a number: ")
        val number = readInt()
        if (number % 3 == 0 & number % 5 == 0){
            print("FizzBuzz")
        } else if(number % 3 == 0 & number % 5 != 0) {
            print("Fizz")            
        } else if (number % 5 == 0 & number % 3 != 0) {
            print("buzz")
        } else {
            print(number)
        }
    }
}
