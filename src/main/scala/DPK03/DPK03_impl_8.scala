package DPK03

/*DPK03 Lookup
Create a function that perform a lookup in a map for a given key you hould have id, name.
    lookup(1) -> "John"
Refactor the code so you can lookup for email as well and ge the name and vice versa.

lookup("John") -> "john@john.jhon.com"
lookup("john@john.jhon.com") -> "John"*/

class DPK03_impl_8 {

    private val users = Map(1 -> "John", "John" -> "john@john.jhon.com", "john@john.jhon.com" -> "John")

    def lookup(value: Int | String): String = {
        users.getOrElse(value, "User not found")
    }
}

@main def dpk03Impl8(): Unit = {

    val dpk03 = new DPK03_impl_8

    println(dpk03.lookup(1))
    println(dpk03.lookup("John"))
    println(dpk03.lookup("john@john.jhon.com"))
}