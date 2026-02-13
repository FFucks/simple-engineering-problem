package DPK03

/*DPK03 Lookup
Create a function that perform a lookup in a map for a given key you hould have id, name.
    lookup(1) -> "John"
Refactor the code so you can lookup for email as well and ge the name and vice versa.

lookup("John") -> "john@john.jhon.com"
lookup("john@john.jhon.com") -> "John"*/

sealed trait Lookup

case class ById(id: Int) extends Lookup
case class ByName(name: String) extends Lookup
case class ByEmail(email: String) extends Lookup

class DPK03_impl_6 {

    private val nameById = Map(1 -> "John")
    private val emailByName = Map("John" -> "john@john.jhon.com")
    private val nameByEmail = Map("john@john.jhon.com" -> "John")

    def lookup(key: Lookup): String = {
        key match {
            case ById(id) => nameById.getOrElse(id, "User not found")

            case ByName(name) => emailByName.getOrElse(name, "User not found")

            case ByEmail(email) => nameByEmail.getOrElse(email, "User not found")

        }
    }
}

@main def dpk03Impl6(): Unit = {

    val dpk03 = new DPK03_impl_6

    println(dpk03.lookup(ById(1)))
    println(dpk03.lookup(ByName("John")))
    println(dpk03.lookup(ByEmail("john@john.jhon.com")))
    //It shows error
    //println(dpk03.lookup(true))
}