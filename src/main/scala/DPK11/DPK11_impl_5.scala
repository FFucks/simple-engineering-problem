package DPK11

import scala.collection.mutable

/*Create a function that can replace a given token in a string.
replace("Hello,World,How,Are,You", ",", "-") -> "Hello-World-How-Are-You" The replace function should recive a string
, a token to be replaced and a new token.Refactor the code to not only replace one token but a string that you can recive by parameter.
replace("Hello,World,How,Are,You", ",World,", "-") -> "Hello-How-Are-You"
Now refactor the code and do not use any prebuild function.*/

class DPK11_impl_5 {

    def replace(text: String, token: String, newToken: String): String = {
        val stack = mutable.Stack[Char]()

        for (ch <- text) {
            stack.push(ch)

            if (stack.size >= token.length) {
                val topChars = stack.take(token.length).reverse.mkString

                if (topChars == token) {
                    for (_ <- 0 until token.length) stack.pop()
                    newToken.reverse.foreach(stack.push)
                }
            }
        }

        stack.reverse.mkString
    }

}

@main def dpk11Impl5(): Unit = {

    val dpk11 = new DPK11_impl_5

    println(dpk11.replace("Hello,World,How,Are,You", ",", "-"))
    println(dpk11.replace("Hello,World,How,Are,You", ",World,", "-"))

}
