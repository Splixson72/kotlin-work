// Task 5.1.1: anagrams() function
fun anagrams(first: String, second: String):Boolean{
    if (first.length != second.length) {
        return false
    }
    val firstchars = first.lowercase().toList().sorted()
    val secondchars = second.lowercase().toList().sorted()
    return firstchars == secondchars
}