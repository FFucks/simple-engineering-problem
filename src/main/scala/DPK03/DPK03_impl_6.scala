package DPK03

/*DPK03 Lookup
Create a function that perform a lookup in a map for a given key you hould have id, name.
    lookup(1) -> "John"
Refactor the code so you can lookup for email as well and ge the name and vice versa.

lookup("John") -> "john@john.jhon.com"
lookup("john@john.jhon.com") -> "John"*/

case class User(
                   id: Int,
                   name: String,
                   email: String
               )

class DPK03_impl_6 {

    private val users: Map[Int, User] =
        Map(
            1 -> User(1, "John", "john@john.jhon.com"),
            2 -> User(2, "Fabio", "fabio@fabio.com")
        )

    def lookup(value: Any): String = value match {

        case id: Int =>
            users.get(id)
                .map(_.name)
                .getOrElse("User not found")

        case str: String =>
            users.values
                .find(nameEmail => nameEmail.name == str)
                .map(_.email)
                .orElse(
                    users.values
                        .find(nameEmail => nameEmail.email == str)
                        .map(_.name)
                )
                .getOrElse("User not found")

        case _ =>
            "Invalid type"
    }
}

@main def dpk03Impl6(): Unit = {

    val dpk03 = new DPK03_impl_6

    println(dpk03.lookup(1))
    println(dpk03.lookup("John"))
    println(dpk03.lookup("john@john.jhon.com"))
    println(dpk03.lookup("Eric"))
}