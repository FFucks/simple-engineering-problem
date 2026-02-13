package DPK06

import scala.collection.mutable.ArrayBuffer

/*DPK06 Tokenizer
    Create a function that can tokenize a string based on a token.

tokenize("Hello,World,How,Are,You", ",") -> ["Hello", "World", "How", "Are", "You"]
tokenize("Hello World How Are You", " ") -> ["Hello", "World", "How", "Are", "You"]
tokenize("Hello-World-How-Are-You", "-") -> ["Hello", "World", "How", "Are", "You"]
Can you refactor your code and do that without using any prebuild function like split?*/

class DPK06_impl_5 {

    def tokenize(text: String, token: String): List[String] = {

        val delimiter = token.charAt(0)
        val buffer = ArrayBuffer[String]()
        val current = new StringBuilder()

        for (char <- text) {
            if (char == delimiter) {
                buffer += current.toString()
                current.clear()
            } else {
                current.append(char)
            }
        }

        buffer += current.toString()
        buffer.toList
    }
}

@main def Dpk06Impl5(): Unit = {

    val dpk06 = new DPK06_impl_5

    println(dpk06.tokenize("Hello,World,How,Are,You", ","))
    println(dpk06.tokenize("Hello World How Are You", " "))
    println(dpk06.tokenize("Hello-World-How-Are-You", "-"))

}
