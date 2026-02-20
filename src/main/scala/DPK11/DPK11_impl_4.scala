package DPK11

/*Create a function that can replace a given token in a string.
replace("Hello,World,How,Are,You", ",", "-") -> "Hello-World-How-Are-You" The replace function should recive a string
, a token to be replaced and a new token.Refactor the code to not only replace one token but a string that you can recive by parameter.
replace("Hello,World,How,Are,You", ",World,", "-") -> "Hello-How-Are-You"
Now refactor the code and do not use any prebuild function.*/

class DPK11_impl_4 {

    def replace(text: String, token: String, newToken: String): String = {
        val chars = text.toCharArray
        val result = new StringBuilder
        var index = 0

        while (index < chars.length) {
            if (index + token.length <= chars.length && text.substring(index, index + token.length) == token) {
                result.append(newToken)
                index += token.length
            } else {
                result.append(chars(index))
                index += 1
            }
        }

        result.toString
    }

}

@main def dpk11Impl4(): Unit = {

    val dpk11 = new DPK11_impl_4

    println(dpk11.replace("Hello,World,How,Are,You", ",", "-"))
    println(dpk11.replace("Hello,World,How,Are,You", ",World,", "-"))

}