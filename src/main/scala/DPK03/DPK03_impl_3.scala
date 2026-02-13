package DPK03

/*DPK03 Lookup
Create a function that perform a lookup in a map for a given key you hould have id, name.
    lookup(1) -> "John"
Refactor the code so you can lookup for email as well and ge the name and vice versa.

lookup("John") -> "john@john.jhon.com"
lookup("john@john.jhon.com") -> "John"*/

class DPK03_impl_3 {

    private val userList = List(
        User(1, "John", "john@john.jhon.com")
    )

    def lookup(id: Int): String = {
        var result = "User not found"

        userList.foreach { user =>
            if (user.id == id) {
                result = user.name
            }
        }
        result
    }

    def lookup(nameEmail: String): String = {
        var result = "User not found"

        userList.foreach { user =>
            if (user.name == nameEmail) {
                result = user.email
            }
            else if (user.email == nameEmail) {
                result = user.name
            }
        }

        result
    }
}

@main def dpk03Impl3(): Unit = {

    val dpk03 = new DPK03_impl_3

    println(dpk03.lookup(1))
    println(dpk03.lookup("John"))
    println(dpk03.lookup("john@john.jhon.com"))
}