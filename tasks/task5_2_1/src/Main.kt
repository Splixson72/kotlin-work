// Task 5.2.1: main program
fun main(args:Array<String>)
{
    println("Area = %.4f m^2".format(circleArea(args[0].toDouble())))
    println("Perimeter = %.4f m".format(circlePerimeter(args[0].toDouble())))
}