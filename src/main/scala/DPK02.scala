//DPK02 Revert a List
//Create a function that can revert a list.

object DPK02 {

    def revertList[A](list: List[A]): List[A] = {
        var result = List.empty[A]

        for (element <- list) {
            result = element :: result
        }
        result
    }

}
