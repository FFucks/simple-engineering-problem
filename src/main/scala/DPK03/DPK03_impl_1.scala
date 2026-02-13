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

class DPK03_impl_1 {

    private val userList = List(
        User(1, "John", "john@john.jhon.com")
    )

    def lookup(id: Int): String = {
        for (user <- userList) {
            if (user.id == id) {
                return user.name
            }
        }
        "User not found"
    }

    def lookup(nameEmail: String): String = {
        for (user <- userList) {
            if (user.name == nameEmail) {
                return user.email
            }

            if (user.email == nameEmail) {
                return user.name
            }
        }

        "User not found"
    }
}

@main def dpk03Impl1(): Unit = {

    val dpk03 = new DPK03_impl_1

    println(dpk03.lookup(1))
    println(dpk03.lookup("John"))
    println(dpk03.lookup("john@john.jhon.com"))
}