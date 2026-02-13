package DPK02

//DPK02 Revert a List
//Create a function that can revert a list.

class DPK02_impl_1 {

    def revertList[A](list: List[A]): List[A] = {
        var result = List.empty[A]

        for (element <- list) {
            result = element :: result
        }

        result
    }

}

@main def Dpk02Impl1(): Unit = {

    val dpk02 = new DPK02_impl_1

    println(dpk02.revertList[Int](List(1, 2, 3, 4)))
}
