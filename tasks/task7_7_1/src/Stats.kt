// Task 7.7.1: statistics functions
fun median(numbers: List<Float>)
{
    numbers = numbers.sorted()
    if(numbers.length % 2 == 0)
    {
        return ((numbers[numbers.length() / 2]) + numbers[(numbers.length() / 2) - 1]) / 2
    }
    else
    {
        return numbers[(numbers.length() / 2)]
    }
}