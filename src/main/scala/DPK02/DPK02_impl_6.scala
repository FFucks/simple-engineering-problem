package DPK02

//DPK02 Revert a List
//Create a function that can revert a list.

object DPK02_impl_6 extends App {

    println(revertList[Int](List(1, 2, 3, 4)))

    def revertList[A](list: List[A]): List[A] = {
        var result = List.empty[A]
        var index = list.length - 1

        while (index >= 0) {
            result = result :+ list(index)
            index -= 1
        }

        result
    }

}
