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

object DPK04_impl_2 extends App {

    println(pattern_matcher("Usa"))
    println(pattern_matcher("brazil"))
    println(pattern_matcher("FRANCE"))
    println(pattern_matcher("GeRMaNy"))
    println(pattern_matcher("Argentina"))

    private def pattern_matcher(country: String): String = {
        val c = country.toLowerCase

        if (c == "usa") {
            "English"
        } else if (c == "brazil") {
            "Portuguese"
        } else if (c == "spain") {
            "Spanish"
        } else if (c == "italy") {
            "Italian"
        } else if (c == "france") {
            "French"
        } else if (c == "germany") {
            "German"
        } else "Unknown language"
    }

}
