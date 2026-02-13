package DPK02

//DPK02 Revert a List
//Create a function that can revert a list.

class DPK02_impl_10 {

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

@main def Dpk02Impl10(): Unit = {

    val dpk02 = new DPK02_impl_10

    println(dpk02.revertList[Int](List(1, 2, 3, 4)))
}
