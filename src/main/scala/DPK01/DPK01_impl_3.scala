package DPK01


//DPK01 Revert String
//Create a function that can revert a string.

object DPK01_impl_3 extends App {


    println(revertString("Hello"))

    def revertString(str: String): String = {
        val chars = str.toCharArray
        val strBuilder = new StringBuilder

        for (iterate <- (chars.length - 1) to 0 by -1) {
            strBuilder.append(chars(iterate))
        }

        strBuilder.toString()
    }

}
