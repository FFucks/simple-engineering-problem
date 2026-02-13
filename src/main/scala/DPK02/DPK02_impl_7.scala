package DPK02

//DPK02 Revert a List
//Create a function that can revert a list.

class DPK02_impl_7 {

    def revertList[A](list: List[A]): List[A] = {
        var current = list
        var result = List.empty[A]

        while (current.nonEmpty) {
            result = current.head :: result
            current = current.tail
        }

        result
    }

}

@main def Dpk02Impl7(): Unit = {

    val dpk02 = new DPK02_impl_7

    println(dpk02.revertList[Int](List(1, 2, 3, 4)))
}