package DPK01


//DPK01 Revert String
//Create a function that can revert a string.

class DPK01_impl_5 {

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

@main def Dpk01Impl5(): Unit = {

    val dpk01 = new DPK01_impl_5

    println(dpk01.revertString("Hello"))
}
