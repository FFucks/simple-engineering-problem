package DPK02

//DPK02 Revert a List
//Create a function that can revert a list.

class DPK02_impl_6 {

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

@main def Dpk02Impl6(): Unit = {

    val dpk02 = new DPK02_impl_6

    println(dpk02.revertList[Int](List(1, 2, 3, 4)))
}
