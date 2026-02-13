package DPK01

//DPK01 Revert String
//Create a function that can revert a string.

class DPK01_impl_9 {

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

@main def Dpk01Impl9(): Unit = {

    val dpk01 = new DPK01_impl_9

    println(dpk01.revertString("Hello"))
}
