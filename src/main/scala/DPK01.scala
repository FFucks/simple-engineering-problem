//DPK01 Revert String
//Create a function that can revert a string.


object DPK01 {

    def revertString(str: String): String = {
        var result = ""

        for (s <- str) {
            result = s + result
        }
        result
    }

    @main def run(): Unit =
        println(revertString("Hello"))

}
