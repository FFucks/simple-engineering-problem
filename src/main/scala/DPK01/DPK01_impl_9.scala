package DPK01

//DPK01 Revert String
//Create a function that can revert a string.

object DPK01_impl_9 extends App {

    println(revertString("Hello"))

    def revertString(str: String): String = {
        val result = new Array[Char](str.length)

        var index = str.length - 1
        var current = 0

        while (index >= 0) {
            result(current) = str.charAt(index)
            index -= 1
            current += 1
        }

        new String(result)
    }
}
