package DPK01


//DPK01 Revert String
//Create a function that can revert a string.

object DPK01_impl_5 extends App {

    println(revertString("Hello"))

    def revertString(str: String): String = {
        val stack = scala.collection.mutable.Stack[Char]()

        for (char <- str) {
            stack.push(char)
        }

        val strBuilder = new StringBuilder

        while (stack.nonEmpty) {
            strBuilder.append(stack.pop())
        }

        strBuilder.toString()
    }
}
