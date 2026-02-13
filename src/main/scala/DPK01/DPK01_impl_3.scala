package DPK01


//DPK01 Revert String
//Create a function that can revert a string.

class DPK01_impl_3 {

    def revertString(str: String): String = {
        val chars = str.toCharArray
        val strBuilder = new StringBuilder

        for (iterate <- (chars.length - 1) to 0 by -1) {
            strBuilder.append(chars(iterate))
        }

        strBuilder.toString()
    }

}

@main def Dpk01Impl3(): Unit = {

    val dpk01 = new DPK01_impl_3

    println(dpk01.revertString("Hello"))
}
