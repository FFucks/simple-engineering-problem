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

class DPK04_impl_4 {

    def pattern_matcher(country: String): String = {

        val countryLowerCase = country.toLowerCase

        countryLowerCase match {
            case value if value == "usa"     => "English"
            case value if value == "brazil"  => "Portuguese"
            case value if value == "spain"   => "Spanish"
            case value if value == "italy"   => "Italian"
            case value if value == "france"  => "French"
            case value if value == "germany" => "German"
            case _                           => "Unknown language"
        }
    }
}

@main def Dpk04Impl4(): Unit = {

    val dpk04 = new DPK04_impl_4

    println(dpk04.pattern_matcher("Usa"))
    println(dpk04.pattern_matcher("brazil"))
    println(dpk04.pattern_matcher("FRANCE"))
    println(dpk04.pattern_matcher("GeRMaNy"))
    println(dpk04.pattern_matcher("Argentina"))

}
