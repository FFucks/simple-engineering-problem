package DPK06

class DPK06_impl_10 {

    def tokenize(text: String, token: String): List[String] = {
        val delimiter = token.charAt(0)
        var result = List.empty[String]
        var currentText = ""
        var index = 0

        while (index < text.length) {
            val char = text.charAt(index)

            if (char == delimiter) {
                result = result :+ currentText
                currentText = ""
            } else {
                currentText += char
            }

            index += 1
        }

        result :+ currentText
    }
}

@main def Dpk06Impl10(): Unit = {

    val dpk06 = new DPK06_impl_10

    println(dpk06.tokenize("Hello,World,How,Are,You", ","))
    println(dpk06.tokenize("Hello World How Are You", " "))
    println(dpk06.tokenize("Hello-World-How-Are-You", "-"))

}
