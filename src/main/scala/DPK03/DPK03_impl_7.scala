package DPK03

/*DPK03 Lookup
Create a function that perform a lookup in a map for a given key you hould have id, name.
    lookup(1) -> "John"
Refactor the code so you can lookup for email as well and ge the name and vice versa.

lookup("John") -> "john@john.jhon.com"
lookup("john@john.jhon.com") -> "John"*/

class DPK03_impl_7 {

    private val users = Map(1 -> "John", "John" -> "john@john.jhon.com", "john@john.jhon.com" -> "John")

    def lookup(value: Any): String = {
        value match {
            case id: Int => users.getOrElse(id, "User not found")
            case nameEmail: String => users.getOrElse(nameEmail, "User not found")
            case _ => "Invalid type"
        }
    }

}

@main def dpk03Impl7(): Unit = {

    val dpk03 = new DPK03_impl_7

    println(dpk03.lookup(1))
    println(dpk03.lookup("John"))
    println(dpk03.lookup("john@john.jhon.com"))
}