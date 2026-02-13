package DPK01

//DPK01 Revert String
//Create a function that can revert a string.


class DPK01_impl_1 {

    def revertString(str: String): String = {
        var result = ""

        for (s <- str) {
            result = s + result
        }
        result
    }

}

@main def Dpk01Impl1(): Unit = {

    val dpk01 = new DPK01_impl_1

    println(dpk01.revertString("Hello"))

}
