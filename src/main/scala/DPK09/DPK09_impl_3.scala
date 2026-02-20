package DPK09

/*Create a function that can filter a list based on a given condition.

filter([1,2,3,4,5,6,7,8,9,10], (x) => x % 2 == 0) -> [2,4,6,8,10]
The filter function should recive a collection(list or array) and a function that will be apply to each element of the collection.

Now refactor the code and do not use any prebuild function.*/

class DPK09_impl_3 {

    def filter[A](list: List[A], func: A => Boolean): List[A] = {
        var result = List.empty[A]

        list.foreach { element =>
            if (func(element)) {
                result = result :+ element
            }
        }

        result
    }
}

@main def dpk09Impl3(): Unit = {

    val dpk09 = new DPK09_impl_3

    println(dpk09.filter[Int](List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), (x => x % 2 == 0)))
    println(dpk09.filter[Int](List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), (x => x % 2 > 0)))
    println(dpk09.filter[Int](List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), (x => x % 2 < 0)))

}