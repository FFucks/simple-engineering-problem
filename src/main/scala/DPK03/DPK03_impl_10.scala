package DPK03

/*DPK03 Lookup
Create a function that perform a lookup in a map for a given key you hould have id, name.
    lookup(1) -> "John"
Refactor the code so you can lookup for email as well and ge the name and vice versa.

lookup("John") -> "john@john.jhon.com"
lookup("john@john.jhon.com") -> "John"*/

class DPK03_impl_10 {

    private val users = Map[Any, (String, String)](
        1 -> ("John", "john@john.jhon.com"),
        "John" -> ("John", "john@john.jhon.com"),
        "john@john.jhon.com" -> ("John", "john@john.jhon.com"),

        2 -> ("Fabio", "fabio@fabio.com"),
        "Fabio" -> ("Fabio", "fabio@fabio.com"),
        "fabio@fabio.com" -> ("Fabio", "fabio@fabio.com")
    )

    def lookup(value: Any): String =
        users.get(value) match {
            case Some((name, email)) =>
                if (value == name) {
                    email
                } else {
                    name
                }
            case None =>
                "User not found"
        }

}

@main def dpk03Impl10(): Unit = {

    val dpk03 = new DPK03_impl_10

    println(dpk03.lookup(1))
    println(dpk03.lookup("John"))
    println(dpk03.lookup("john@john.jhon.com"))
    println(dpk03.lookup("Eric"))
}