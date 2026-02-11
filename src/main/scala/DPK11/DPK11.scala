package DPK11

/*DPK11 Replace
Create a function that can replace a given token in a string.

replace("Hello,World,How,Are,You", ",", "-") -> "Hello-World-How-Are-You"
The replace function should receive a string, a token to be replaced and a new token. Refactor the code to not only replace one token but a string that you can receive by parameter.

replace("Hello,World,How,Are,You", ",World,", "-") -> "Hello-How-Are-You"
Now refactor the code and do not use any prebuild function.*/


object DPK11 extends App {


    //println(replace("Hello,World,How,Are,You", ",", "-"))
    println(word("Hello,World,How,Are,You", ",World,", "-"))

    def word(text: String, token: String, newToken: String): String = {
        var count = 0
        var resultText = ""
        var tokenLength = token.length
        var textPosition = tokenLength

        while (count < text.length) {
            if (textPosition >= text.length) {
                return resultText
            }

            val scriptText = text.substring(count, textPosition)

            if (scriptText == token) {
                resultText += newToken
                count += tokenLength
                textPosition += tokenLength
            } else {
                resultText += text.charAt(count)
            }

            count += 1
            textPosition += 1
        }

        resultText
    }

    def replace(text: String, token: String, newToken: String): String = {
        val delimiter = token.charAt(0)

        var tokenSize = token.length
        var resultText = ""

        var currentText = ""
        var textCount = 0

        for (char <- text) {
            if (char != delimiter) {
                resultText += char
            } else {
                resultText += newToken
            }
        }

        resultText
    }




}
