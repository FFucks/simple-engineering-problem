package DPK04

/*DPK04 Simple Pattern Matcher
    Given the following countries and languages:

Usa -> English
Brazil -> Portuguese
Spain -> Spanish
Italy -> Italian
France -> French
Germany -> German
Create a function that can return the language for a given country. You cannot use a hashmap or dictionary.

pattern_matcher("Usa") -> "English"
Refactor the code, can you do that without using IF statements?

pattern_matcher("Usa") -> "English"*/

sealed trait Country {
    def language: String
}
case object Usa extends Country {
    val language = "English"
}
case object Brazil extends Country {
    val language = "Portuguese"
}
case object Spain extends Country {
    val language = "Spanish"
}
case object Italy extends Country {
    val language = "Italian"
}
case object France extends Country {
    val language = "French"
}
case object Germany extends Country {
    val language = "German"
}

class DPK04_impl_5 {

    def pattern_matcher(country: String): String = {
        country.toLowerCase match {
            case "usa" => Usa.language
            case "brazil" => Brazil.language
            case "spain" => Spain.language
            case "italy" => Italy.language
            case "france" => France.language
            case "germany" => Germany.language
            case _ => "Unknown language"
        }
    }
}

@main def Dpk04Impl5(): Unit = {

    val dpk04 = new DPK04_impl_5

    println(dpk04.pattern_matcher("Usa"))
    println(dpk04.pattern_matcher("brazil"))
    println(dpk04.pattern_matcher("FRANCE"))
    println(dpk04.pattern_matcher("GeRMaNy"))
    println(dpk04.pattern_matcher("Argentina"))

}
