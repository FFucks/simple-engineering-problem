package DPK06

/*DPK06 Tokenizer
    Create a function that can tokenize a string based on a token.

tokenize("Hello,World,How,Are,You", ",") -> ["Hello", "World", "How", "Are", "You"]
tokenize("Hello World How Are You", " ") -> ["Hello", "World", "How", "Are", "You"]
tokenize("Hello-World-How-Are-You", "-") -> ["Hello", "World", "How", "Are", "You"]
Can you refactor your code and do that without using any prebuild function like split?*/

import scala.collection.mutable.ListBuffer

class DPK06_impl_3 {
    def tokenize(text: String, token: String): List[String] = {

        val delimiter = token.charAt(0)
        val result = ListBuffer[String]()
        var current = ""

        for (char <- text) {
            if (char == delimiter) {
                result += current
                current = ""
            } else {
                current += char
            }
        }

        result += current
        result.toList
    }
}

@main def Dpk06Impl3(): Unit = {

    val dpk06 = new DPK06_impl_3

    println(dpk06.tokenize("Hello,World,How,Are,You", ","))
    println(dpk06.tokenize("Hello World How Are You", " "))
    println(dpk06.tokenize("Hello-World-How-Are-You", "-"))

}
