package DPK11

/*Create a function that can replace a given token in a string.
replace("Hello,World,How,Are,You", ",", "-") -> "Hello-World-How-Are-You" The replace function should recive a string
, a token to be replaced and a new token.Refactor the code to not only replace one token but a string that you can recive by parameter.
replace("Hello,World,How,Are,You", ",World,", "-") -> "Hello-How-Are-You"
Now refactor the code and do not use any prebuild function.*/

class DPK11_impl_8 {

    def replace(text: String, token: String, newToken: String): String = {
        val result = new StringBuilder
        var start = 0
        var index = text.indexOf(token)

        while (index != -1) {
            result.append(text.substring(start, index))
            result.append(newToken)
            start = index + token.length
            index = text.indexOf(token, start)
        }

        result.append(text.substring(start))
        result.toString
    }

}

@main def dpk11Impl8(): Unit = {

    val dpk11 = new DPK11_impl_8

    println(dpk11.replace("Hello,World,How,Are,You", ",", "-"))
    println(dpk11.replace("Hello,World,How,Are,You", ",World,", "-"))

}