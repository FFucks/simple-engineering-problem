package DPK01


//DPK01 Revert String
//Create a function that can revert a string.

class DPK01_impl_4 {

    def revertString(str: String): String = {
        val chars = str.toCharArray
        val strBuilder = new StringBuilder

        var iterate = chars.length - 1
        while (iterate >= 0) {
            strBuilder.append(chars(iterate))
            iterate -= 1
        }

        strBuilder.toString()
    }
}

@main def Dpk01Impl4(): Unit = {

    val dpk01 = new DPK01_impl_4

    println(dpk01.revertString("Hello"))
}
