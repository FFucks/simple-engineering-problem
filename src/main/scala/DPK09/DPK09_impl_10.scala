package DPK09

class DPK09_impl_10 {

    def filter[A](list: List[A], func: A => Boolean): List[A] = {
        var result = List.empty[A]

        for (index <- list.indices) {
            val element = list(index)
            if (func(element)) {
                result = result :+ element
            }
        }

        result
    }
}

@main def dpk09Impl10(): Unit = {

    val dpk09 = new DPK09_impl_10

    println(dpk09.filter[Int](List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), (x => x % 2 == 0)))
    println(dpk09.filter[Int](List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), (x => x % 2 > 0)))
    println(dpk09.filter[Int](List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), (x => x % 2 < 0)))

}