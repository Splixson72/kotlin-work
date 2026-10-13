// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(input:String,text:String,character:Char='X'):String
{
    var replacement = ""
    repeat(text.length)
    {
        replacement = replacement + character
    }
    var newString = input.replace(text,replacement)
    return newString
}