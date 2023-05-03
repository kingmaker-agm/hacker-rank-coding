package domains.algorithms.warmup

/**
 * @link https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true
 * Given an array of integers, find the sum of its elements.
 *
 * For example, if the array , ar = [1,2,3] , 1+2+3 = 6 so return 6.
 *
 * # Sample Input
 * 6
 * 1 2 3 4 10 11
 *
 * # Sample Output
 *
 * 31
 */

fun simpleArraySum(ar: Array<Int>): Int {
    return ar.toList()
        .fold(0) { sum, number -> sum + number}
}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}