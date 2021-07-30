package exercises

import java.lang.StringBuilder

fun countVowels(phrase:String): Int{
    val vowels = "aeiou"
    var totalVowels = 0
    for (letter in phrase){
        if (letter.toLowerCase() in vowels) totalVowels++
    }
    return totalVowels
}

fun countConsonants(phrase: String): Int{
    val consonant = "bcdfghjklmnpqrstvxywz"
    var totalConsonants = 0
    for (letter in phrase){
        if (letter.toLowerCase() in consonant) totalConsonants++
    }
    return totalConsonants
}