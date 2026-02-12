package DPK01


//DPK01 Revert String
//Create a function that can revert a string.

object DPK01_impl_8 extends App {

    println(revertString("Hello"))

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
