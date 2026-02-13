package DPK01

//DPK01 Revert String
//Create a function that can revert a string.

class DPK01_impl_10 {

    def revertString(str: String): String = {
        var result = ""
        var index = str.length - 1

        while (index >= 0) {
            result += str(index)
            index -= 1
        }

        result
    }

}

@main def Dpk01Impl10(): Unit = {

    val dpk01 = new DPK01_impl_10

    println(dpk01.revertString("Hello"))
}
