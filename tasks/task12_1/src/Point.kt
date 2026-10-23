import kotlin.math.hypot
// Task 12.1: Point class

class Point (var x: Double, var y:Double){
    fun distance() = hypot(x,y)
    fun distanceTo(a: Double,b: Double) = hypot((x-a),(y-b))
}