package DPK06

/*DPK06 Tokenizer
    Create a function that can tokenize a string based on a token.

tokenize("Hello,World,How,Are,You", ",") -> ["Hello", "World", "How", "Are", "You"]
tokenize("Hello World How Are You", " ") -> ["Hello", "World", "How", "Are", "You"]
tokenize("Hello-World-How-Are-You", "-") -> ["Hello", "World", "How", "Are", "You"]
Can you refactor your code and do that without using any prebuild function like split?*/

class DPK06_impl_6 {

    def tokenize(text: String, token: String): List[String] = {

        val delimiter = token.head
        var remaining = text
        var current = ""
        var result = List.empty[String]

        while (remaining.nonEmpty) {
            if (remaining.head == delimiter) {
                result = result :+ current
                current = ""
            } else {
                current += remaining.head
            }

            remaining = remaining.tail
        }

        result :+ current
    }
}

@main def Dpk06Impl6(): Unit = {

    val dpk06 = new DPK06_impl_6

    println(dpk06.tokenize("Hello,World,How,Are,You", ","))
    println(dpk06.tokenize("Hello World How Are You", " "))
    println(dpk06.tokenize("Hello-World-How-Are-You", "-"))

}
