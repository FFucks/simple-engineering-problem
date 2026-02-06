package DPK01


//DPK01 Revert String
//Create a function that can revert a string.

object DPK01_impl_4 extends App {

    println(revertString("Hello"))

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
