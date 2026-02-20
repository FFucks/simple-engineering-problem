package DPK11

/*Create a function that can replace a given token in a string.
replace("Hello,World,How,Are,You", ",", "-") -> "Hello-World-How-Are-You" The replace function should recive a string
, a token to be replaced and a new token.Refactor the code to not only replace one token but a string that you can recive by parameter.
replace("Hello,World,How,Are,You", ",World,", "-") -> "Hello-How-Are-You"
Now refactor the code and do not use any prebuild function.*/

class DPK11_impl_2 {

    def replace(text: String, token: String, newToken: String): String = {
        var result = ""
        var index = 0

        while (index < text.length) {

            if (index < text.length) {
                if (index + token.length <= text.length && text.substring(index, index + token.length) == token) {

                    result += newToken
                    index += token.length
                } else {
                    result += text(index)
                    index += 1
                }
            }
        }

        result
    }

}

@main def dpk11Impl2(): Unit = {

    val dpk11 = new DPK11_impl_2

    println(dpk11.replace("Hello,World,How,Are,You", ",", "-"))
    println(dpk11.replace("Hello,World,How,Are,You", ",World,", "-"))

}
