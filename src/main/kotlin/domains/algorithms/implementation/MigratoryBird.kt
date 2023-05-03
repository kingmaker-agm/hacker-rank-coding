package domains.algorithms.implementation

/**
 * @link https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true
 *
 * Given an array of bird sightings where every element represents a bird type id, determine the id of the most
 * frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.
 *
 * Example
 * -------
 * arr = [1,1,2,2,3]
 * There are two each of types 1 and 2, and one sighting of type 3. Pick the lower of the two types seen twice: type 1.
 */
fun migratoryBirds(arr: Array<Int>): Int {
    val map = arr.groupBy { it }.toSortedMap()

    var maxCount = 0
    var index = 0
    for (key in map.keys) {
        val count = map.get(key)?.size ?: 0
        if (count > maxCount) {
            maxCount = count
            index = key
        }
    }

    return index
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}