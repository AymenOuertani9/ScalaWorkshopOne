import scala.io.StdIn.readChar

object exercise {
    def main(args : Array[String]) : Unit = {
        val vowelsList = List('a', 'e', 'i', 'o', 'u') 
        print("Enter a character: ")
        val character = readChar()
        if (vowelsList.contains(character)){
            print("the character is vawel")
        } else {
        print("The character is consonant")
        }
    }
}
