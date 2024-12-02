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

fun findSimilarityScore(points1: List<Int>, points2:List<Int>): Int{
    val similarityList = points1.map { point1Item->
        val numberOfOccurrences = points2.filter {
            point1Item == it
        }.size
        point1Item * numberOfOccurrences
    }
    return  similarityList.sum()
}