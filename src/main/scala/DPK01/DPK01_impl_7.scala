package DPK01


//DPK01 Revert String
//Create a function that can revert a string.

class DPK01_impl_7 {

    def revertString(str: String): String = {
        val arr = str.toCharArray
        val result = new Array[Char](arr.length)

        var index = 0
        while (index < arr.length) {
            result(index) = arr(arr.length - 1 - index)
            index += 1
        }

        new String(result)
    }
}

@main def Dpk01Impl7(): Unit = {

    val dpk01 = new DPK01_impl_7

    println(dpk01.revertString("Hello"))
}
