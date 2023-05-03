package domains.algorithms.implementation

/**
 * @link https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?isFullScreen=true
 *
 * Given an array of integers ar and a positive integer k, determine the number of (i,j) pairs where i < j
 * and ar[i] + ar[j] is divisible by k
 *
 * Example
 * -------
 * ar = [1,2,3,4,5,6]
 * k = 5
 *
 * Three pairs meet the criteria: [1,4], [2,3] and [4,6].
 */
fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var result = 0
    for (i in 0 until n) {
        if (i+1 >= n) break

        for (j in i + 1 until n)
            if ((ar[i] + ar[j]) % k == 0) result++
    }

    return result
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}