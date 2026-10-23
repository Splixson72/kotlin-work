// Task 7.7.1: statistics functions
fun median(numbers: List<Float>):Float
{
    var numbers = numbers.sorted()
    if (numbers.size == 0){throw IllegalArgumentException("empty list")}
    if(numbers.size % 2 == 0)
    {
        return ((numbers[numbers.size / 2]) + numbers[(numbers.size / 2) - 1]) / 2
    }
    else
    {
        return numbers[(numbers.size / 2)]
    }
}