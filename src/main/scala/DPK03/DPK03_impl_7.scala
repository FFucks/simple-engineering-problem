package DPK03

/*DPK03 Lookup
Create a function that perform a lookup in a map for a given key you hould have id, name.
    lookup(1) -> "John"
Refactor the code so you can lookup for email as well and ge the name and vice versa.

lookup("John") -> "john@john.jhon.com"
lookup("john@john.jhon.com") -> "John"*/

class DPK03_impl_7 {

    private val usersByName = Map(
        "John" -> User(1, "John", "john@john.jhon.com"),
        "Fabio" -> User(2, "Fabio", "fabio@fabio.com")
    )

    def lookup(value: Any): String = value match {

        case id: Int =>
            usersByName.values
                .find(user => user.id == id)
                .map(_.name)
                .getOrElse("User not found")

        case name: String if (usersByName.contains(name)) =>
            usersByName(name).email

        case email: String =>
            usersByName.values
                .find(user => user.email == email)
                .map(_.name)
                .getOrElse("User not found")

        case _ =>
            "Invalid type"
    }
}

@main def dpk03Impl7(): Unit = {

    val dpk03 = new DPK03_impl_7

    println(dpk03.lookup(1))
    println(dpk03.lookup("John"))
    println(dpk03.lookup("john@john.jhon.com"))
    println(dpk03.lookup("Eric"))
}
