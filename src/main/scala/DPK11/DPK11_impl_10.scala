package DPK11

class DPK11_impl_10 {

    def replace(text: String, token: String, newToken: String): String = {
        var result = ""
        var remaining = text
        var index = remaining.indexOf(token)

        while (index != -1) {
            result += remaining.take(index)
            result += newToken
            remaining = remaining.drop(index + token.length)
            index = remaining.indexOf(token)
        }

        result + remaining
    }

}

@main def dpk11Impl10(): Unit = {

    val dpk11 = new DPK11_impl_10

    println(dpk11.replace("Hello,World,How,Are,You", ",", "-"))
    println(dpk11.replace("Hello,World,How,Are,You", ",World,", "-"))

}

