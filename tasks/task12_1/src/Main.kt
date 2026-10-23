// Task 12.1: program that uses a Point object
import Point
fun main() {
val p = Point(4.0, 6.0)
println(p.x)   // prints 4.0
println(p.y)   // prints 6.0
println(p.distance())
println(p.distanceTo(4.5,7.0))
}