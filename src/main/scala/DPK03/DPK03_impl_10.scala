package DPK03

/*DPK03 Lookup
Create a function that perform a lookup in a map for a given key you hould have id, name.
    lookup(1) -> "John"
Refactor the code so you can lookup for email as well and ge the name and vice versa.

lookup("John") -> "john@john.jhon.com"
lookup("john@john.jhon.com") -> "John"*/

class DPK03_impl_10 {

    private val users = List(
        (1, "John", "john@john.jhon.com"),
        (2, "Fabio", "fabio@fabio.com")
    )

    def lookup(value: Int | String): String = {
        for (user <- users) {
            val id = user._1
            val name = user._2
            val email = user._3

            if (value == id) {
                return name
            }
            if (value == name) {
                return email
            }
            if (value == email) {
                return name
            }
        }

        "User not found"
    }
}

@main def dpk03Impl10(): Unit = {

    val dpk03 = new DPK03_impl_10

    println(dpk03.lookup(1))
    println(dpk03.lookup("John"))
    println(dpk03.lookup("john@john.jhon.com"))
    println(dpk03.lookup("Fabio"))
}