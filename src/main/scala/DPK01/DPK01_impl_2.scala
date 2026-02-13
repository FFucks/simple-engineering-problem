package DPK01


//DPK01 Revert String
//Create a function that can revert a string.

class DPK01_impl_2 {

    def revertString(str: String): String = {
        if (str.isEmpty) {
            ""
        } else {
            revertString(str.tail) + str.head
        }
    }

}

@main def Dpk01Impl2(): Unit = {

    val dpk01 = new DPK01_impl_2

    println(dpk01.revertString("Hello"))
}
