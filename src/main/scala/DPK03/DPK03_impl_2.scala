package DPK03

/*DPK03 Lookup
Create a function that perform a lookup in a map for a given key you hould have id, name.
    lookup(1) -> "John"
Refactor the code so you can lookup for email as well and ge the name and vice versa.

lookup("John") -> "john@john.jhon.com"
lookup("john@john.jhon.com") -> "John"*/

class DPK03_impl_2 {

    private val userList = List(
        User(1, "John", "john@john.jhon.com")
    )

    def lookup(id: Int): String = {
        var index = 0

        while (index < userList.length) {
            if (userList(index).id == id) {
                return userList(index).name
            }

            index += 1
        }

        "User not found"
    }

    def lookup(nameEmail: String): String = {

        for (user <- userList) {
            nameEmail match {
                case name if name == user.name => {
                    return user.email
                }
                case email if email == user.email => {
                    return user.name
                }
                case _ =>
            }
        }

        "User not found"
    }
}

@main def dpk03Impl2(): Unit = {

    val dpk03 = new DPK03_impl_2

    println(dpk03.lookup(1))
    println(dpk03.lookup("John"))
    println(dpk03.lookup("john@john.jhon.com"))
}