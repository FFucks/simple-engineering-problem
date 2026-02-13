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

class DPK04_impl_8 {

    private val languages = Map(
        "usa" -> "English",
        "brazil" -> "Portuguese",
        "spain" -> "Spanish",
        "italy" -> "Italian",
        "france" -> "French",
        "germany" -> "German"
    )

    def pattern_matcher(country: String): String = {

        val countryLowerCase = country.toLowerCase
        val iterator = languages.iterator

        var result = "Unknown language"

        while (iterator.hasNext) {
            val (key, value) = iterator.next()
            if (key == countryLowerCase) {
                result = value
            }
        }

        result
    }

}

@main def Dpk04Impl8(): Unit = {

    val dpk04 = new DPK04_impl_8

    println(dpk04.pattern_matcher("Usa"))
    println(dpk04.pattern_matcher("brazil"))
    println(dpk04.pattern_matcher("FRANCE"))
    println(dpk04.pattern_matcher("GeRMaNy"))
    println(dpk04.pattern_matcher("Argentina"))

}
