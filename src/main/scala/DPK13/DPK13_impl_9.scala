package DPK13

class DPK13_impl_9 {

    def fizzBuzz(numbers: Int): List[Int | String] = {
        (1 to numbers).map { element =>
            if (element % 15 == 0) {
                "FizzBuzz"
            } else if (element % 3 == 0) {
                "Fizz"
            } else if (element % 5 == 0) {
                "Buzz"
            } else {
                element
            }
        }.toList
    }
}

@main def dpk13Impl9(): Unit = {

    val dpk13 = new DPK13_impl_9

    println(dpk13.fizzBuzz(100))
    println(dpk13.fizzBuzz(10))
    println(dpk13.fizzBuzz(15))
}