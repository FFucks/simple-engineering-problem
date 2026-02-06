package DPK02


//DPK02 Revert a List
//Create a function that can revert a list.

object DPK02_impl_2 extends App {


    println(revertList[Int](List(1, 2, 3, 4)))

    def revertList[A](list: List[A]): List[A] = {
        var result = List.empty[A]

        //Works using list.indices.reverse
        for (index <- (list.length - 1) to 0 by -1 ) {
            result = result :+ list(index)
        }
        result
    }

}
