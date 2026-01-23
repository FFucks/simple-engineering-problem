/*DPK06 Tokenizer
    Create a function that can tokenize a string based on a token.

tokenize("Hello,World,How,Are,You", ",") -> ["Hello", "World", "How", "Are", "You"]
tokenize("Hello World How Are You", " ") -> ["Hello", "World", "How", "Are", "You"]
tokenize("Hello-World-How-Are-You", "-") -> ["Hello", "World", "How", "Are", "You"]
Can you refactor your code and do that without using any prebuild function like split?*/

object DPK06 extends App {

    println(tokenize("Hello,World,How,Are,You", ","))
    println(tokenize("Hello World How Are You", " "))
    println(tokenize("Hello-World-How-Are-You", "-"))

    def tokenize(text: String, token: String): List[String] = {
        val delimiter = token.charAt(0)
        var result = List.empty[String]
        var currentText = ""

        for (char <- text) {
            if (char == delimiter) {
                result = result :+ currentText
                currentText = ""
            } else {
                currentText += char
            }
        }

        result :+ currentText
    }

}
