package DPK02

//DPK02 Revert a List
//Create a function that can revert a list.

object DPK02_impl_9 extends App {

    println(revertList[Int](List(1, 2, 3, 4)))

    def revertList[A](list: List[A]): List[A] = {

        var current = list
        var result = List.empty[A]

        while (current.nonEmpty) {
            val last = current.last
            result = result :+ last
            current = current.init
        }

        result
    }

}
