package DPK08

/*DPK08 Map
 Create a function that can map a function execution to each element of a list, return a new list.

map([1,2,3,4,5], (x) => x * 2) -> [2,4,6,8,10]
The map function should recive a collection(list or array) and a function that will be apply to each element of the collection.

Now refactor the code and do not use any prebuild function.*/

class DPK08_impl_4 {

    def map[A, B](list: List[A], func: A => B): List[B] = {
        var current = list
        var result = List.empty[B]

        while (current.nonEmpty) {
            result = func(current.head) :: result
            current = current.tail
        }

        result.reverse
    }
}

@main def dpk08Impl4(): Unit = {

    val dpk08 = new DPK08_impl_4

    println(dpk08.map(List(1, 2, 3, 4, 5), (x => x * 2)))
    println(dpk08.map(List(1, 2, 3, 4, 5), (x => x - 1)))
    println(dpk08.map(List(2, 4, 6, 8, 10), (x => x / 2)))
    println(dpk08.map(List(1, 2, 3, 4, 5), (x => x + 2)))
    println(dpk08.map(List(2, 4, 6, 8, 10), (x => x % 3)))
}