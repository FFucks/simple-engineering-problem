package DPK09

/*Create a function that can filter a list based on a given condition.

filter([1,2,3,4,5,6,7,8,9,10], (x) => x % 2 == 0) -> [2,4,6,8,10]
The filter function should recive a collection(list or array) and a function that will be apply to each element of the collection.

Now refactor the code and do not use any prebuild function.*/




object DPK09_impl_1 extends App {

    println(filter[Int](List(1,2,3,4,5,6,7,8,9,10), (x => x % 2 == 0)))
    println(filter[Int](List(1,2,3,4,5,6,7,8,9,10), (x => x % 2 > 0)))
    println(filter[Int](List(1,2,3,4,5,6,7,8,9,10), (x => x % 2 < 0)))

    // Or Function1[A, Boolean]
    def filter[A](list: List[A], func: A => Boolean): List[A] = {

        var result = List.empty[A]

        for (element <- list) {
            if (func.apply(element)) {
                result = result :+ element
            }
        }
        result
    }

}
