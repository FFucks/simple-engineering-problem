package DPK01


//DPK01 Revert String
//Create a function that can revert a string.

class DPK01_impl_8 {

    def revertString(str: String): String = {
        var result = ""
        var index = 0

        while (index < str.length) {
            result = str.charAt(index) + result
            index += 1
        }

        result
    }

}

@main def Dpk01Impl8(): Unit = {

    val dpk01 = new DPK01_impl_8

    println(dpk01.revertString("Hello"))
}
