// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(Triangle:Triple<Double,Double,Double>): Boolean
{
    if(Triangle.first + Triangle.second > Triangle.third && Triangle.third + Triangle.second > Triangle.first && Triangle.first + Triangle.third > Triangle.second)
    {
        return true
    }
    return false
}
fun triangleArea(Triangle:Triple<Double,Double,Double>):Double{
    val a: Double = Triangle.first
    val b: Double = Triangle.second
    val c: Double = Triangle.third
    if(isValidTriangle(Triangle(a,b,c)) == false){
        throw IllegalArgumentException("invalid triangle")
    }
    val s: Double = (0.5)*(a+b+c)
    val Area: Double = Math.sqrt((s*(s-a)*(s-b)*(s-c)))
    return Area
}