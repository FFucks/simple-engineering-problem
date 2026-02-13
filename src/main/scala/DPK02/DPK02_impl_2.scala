package DPK02


//DPK02 Revert a List
//Create a function that can revert a list.

class DPK02_impl_2 {

    def revertList[A](list: List[A]): List[A] = {
        var result = List.empty[A]

        //Works using list.indices.reverse
        for (index <- (list.length - 1) to 0 by -1 ) {
            result = result :+ list(index)
        }
        
        result
    }

}

@main def Dpk02Impl2(): Unit = {

    val dpk02 = new DPK02_impl_2

    println(dpk02.revertList[Int](List(1, 2, 3, 4)))
}
