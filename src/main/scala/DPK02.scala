//DPK02 Revert a List
//Create a function that can revert a list.

object DPK02 extends App {

    println(revertList[Int](List(1, 2, 3, 4)))

    def revertList[A](list: List[A]): List[A] = {
        var result = List.empty[A]

        for (element <- list) {
            result = element :: result

            //Same logic but bad performance
            //result = result :+ element
        }
        result
    }

}
