import kotlin.math.abs

fun findLocationDistance(points1: List<Int>, points2:List<Int>): Int{
   val sortedPoint1 = points1.sorted()
    val sortedPoint2 = points2.sorted()

    var distance = 0

    sortedPoint1.forEachIndexed { index, i ->
        distance += abs(i - sortedPoint2[index])
    }


    return  distance
}