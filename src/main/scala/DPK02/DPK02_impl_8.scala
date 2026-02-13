package DPK02

//DPK02 Revert a List
//Create a function that can revert a list.

class DPK02_impl_8 {

    def revertList[A](list: List[A]): List[A] = {
        if (list.isEmpty) {
            Nil
        } else {
            revertList(list.tail) :+ list.head
        }
    }

}

@main def Dpk02Impl8(): Unit = {

    val dpk02 = new DPK02_impl_8

    println(dpk02.revertList[Int](List(1, 2, 3, 4)))
}
