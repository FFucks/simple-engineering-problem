package DPK03

/*DPK03 Lookup
Create a function that perform a lookup in a map for a given key you hould have id, name.
    lookup(1) -> "John"
Refactor the code so you can lookup for email as well and ge the name and vice versa.

lookup("John") -> "john@john.jhon.com"
lookup("john@john.jhon.com") -> "John"*/

class DPK03_impl_5 {

    private val nameById = Map(1 -> "John")
    private val emailByName = Map("John" -> "john@john.jhon.com")
    private val nameByEmail = Map("john@john.jhon.com" -> "John")

    def lookup(value: Any): String = {

        value match {
            case id: Int =>
                if (nameById.contains(id)) {
                    nameById(id)
                } else {
                    "User not found"
                }

            case nameEmail: String =>
                if (emailByName.contains(nameEmail)) {
                    emailByName(nameEmail)
                } else if (nameByEmail.contains(nameEmail)) {
                    nameByEmail(nameEmail)
                } else {
                    "User not found"
                }

            case _ => "Invalid Type"
        }
    }
}

@main def dpk03Impl5(): Unit = {

    val dpk03 = new DPK03_impl_5

    println(dpk03.lookup(1))
    println(dpk03.lookup("John"))
    println(dpk03.lookup("john@john.jhon.com"))
    println(dpk03.lookup(true))
}