package DPK06

/*DPK06 Tokenizer
    Create a function that can tokenize a string based on a token.

tokenize("Hello,World,How,Are,You", ",") -> ["Hello", "World", "How", "Are", "You"]
tokenize("Hello World How Are You", " ") -> ["Hello", "World", "How", "Are", "You"]
tokenize("Hello-World-How-Are-You", "-") -> ["Hello", "World", "How", "Are", "You"]
Can you refactor your code and do that without using any prebuild function like split?*/

class DPK06_impl_9 {

    def tokenize(text: String, token: String): List[String] = {

        val delimiter = token.head
        val iterator = text.iterator
        val result = scala.collection.mutable.ListBuffer[String]()
        val current = new StringBuilder()

        while (iterator.hasNext) {
            val char = iterator.next()

            if (char == delimiter) {
                result += current.toString()
                current.clear()
            } else {
                current.append(char)
            }
        }

        result += current.toString()
        result.toList
    }
}

@main def Dpk06Impl9(): Unit = {

    val dpk06 = new DPK06_impl_9

    println(dpk06.tokenize("Hello,World,How,Are,You", ","))
    println(dpk06.tokenize("Hello World How Are You", " "))
    println(dpk06.tokenize("Hello-World-How-Are-You", "-"))

}
