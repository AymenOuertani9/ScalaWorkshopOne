import scala.io.StdIn.readChar

object exercise {
    def main(args : Array[String]) : Unit = {
        val vowelsList = List('a', 'e', 'i', 'o', 'u') 
        print("Enter a character: ")
        val character = readChar()
        if (character.isUpper){
            print("the character is Uppercase letter")
        } else if (character.isLower){
            print("The character is lower letter")
        } else if (character.isDigit) {
        print("The character is digit")
        }
    }
}
