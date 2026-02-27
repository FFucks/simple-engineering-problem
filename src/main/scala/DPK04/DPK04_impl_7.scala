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

class DPK04_impl_7 {

    def pattern_matcher(country: String): String = {
        val result =
            country.toLowerCase match {
                case "usa" => Some(Usa)
                case "brazil" => Some(Brazil)
                case "spain" => Some(Spain)
                case "italy" => Some(Italy)
                case "france" => Some(France)
                case "germany" => Some(Germany)
                case _ => None
            }

        result.map(_.language).getOrElse("Unknown language")
    }

}

@main def Dpk04Impl7(): Unit = {

    val dpk04 = new DPK04_impl_7

    println(dpk04.pattern_matcher("Usa"))
    println(dpk04.pattern_matcher("brazil"))
    println(dpk04.pattern_matcher("FRANCE"))
    println(dpk04.pattern_matcher("GeRMaNy"))
    println(dpk04.pattern_matcher("Argentina"))

}
