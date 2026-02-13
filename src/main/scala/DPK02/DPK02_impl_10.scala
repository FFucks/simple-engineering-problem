package DPK02

//DPK02 Revert a List
//Create a function that can revert a list.

object DPK02_impl_10 extends App {

    println(revertList[Int](List(1, 2, 3, 4)))

    def revertList[A](list: List[A]): List[A] = {

        var result = List.empty[A]
        var current = list

        while (current.nonEmpty) {
            result = current.head :: result
            current = current.tail
        }

        result
    }

}
