package DPK03

/*DPK03 Lookup
Create a function that perform a lookup in a map for a given key you hould have id, name.
    lookup(1) -> "John"
Refactor the code so you can lookup for email as well and ge the name and vice versa.

lookup("John") -> "john@john.jhon.com"
lookup("john@john.jhon.com") -> "John"*/

class DPK03_impl_9 {

    private val nameById = Map(1 -> "John")

    private val nameByEmail = Map("John" -> "john@john.jhon.com")

    private val emailByName = nameByEmail.map(_.swap)

    def lookup(value: Int | String): String =
        value match {
            case id: Int =>
                nameById.getOrElse(id, "User not found")

            case str: String =>
                nameByEmail
                    .get(str)
                    .orElse(emailByName.get(str))
                    .getOrElse("User not found")
        }
}

@main def dpk03Impl9(): Unit = {

    val dpk03 = new DPK03_impl_9

    println(dpk03.lookup(1))
    println(dpk03.lookup("John"))
    println(dpk03.lookup("john@john.jhon.com"))
    println(dpk03.lookup("Fabio"))
}
