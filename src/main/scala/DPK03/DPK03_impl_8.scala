package DPK03

/*DPK03 Lookup
Create a function that perform a lookup in a map for a given key you hould have id, name.
    lookup(1) -> "John"
Refactor the code so you can lookup for email as well and ge the name and vice versa.

lookup("John") -> "john@john.jhon.com"
lookup("john@john.jhon.com") -> "John"*/

sealed trait Key

case class Id(value: Int) extends Key
case class Name(value: String) extends Key
case class Email(value: String) extends Key

class DPK03_impl_8 {

    private val data: Map[Key, String] = Map(
        Id(1) -> "John",
        Name("John") -> "john@john.jhon.com",
        Email("john@john.jhon.com") -> "John"
    )

    def lookup(key: Key): String =
        data.getOrElse(key, "User not found")

}

@main def dpk03Impl8(): Unit = {

    val dpk03 = new DPK03_impl_8

    println(dpk03.lookup(Id(1)))
    println(dpk03.lookup(Name("John")))
    println(dpk03.lookup(Email("john@john.jhon.com")))
    println(dpk03.lookup(Name("Fabio")))
}
