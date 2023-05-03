package domains.algorithms

import kotlin.math.max

/**
 * @link https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true
 *
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 * For example, the square matrix a[rr] is shown below:
 * 1 2 3
 * 4 5 6
 * 9 8 9
 * The left-to-right diagonal = 1+5+9 = 15 . The right to left diagonal = 3+5+9 = 17. Their absolute difference is |15-17| = 2.
 */
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    val rows = arr.size
    val cols = arr.maxOf { it.size }
    if (rows != cols) throw IllegalArgumentException("The Rows and Columns must be same")

    val indexRange = 0 until rows
    val leftToRight = indexRange.fold(0) {sum, index -> sum + arr[index][index]}
    val rightToLeft = indexRange.fold(0) {sum, index -> sum + arr[rows - 1 -index][index]}

    var difference = leftToRight - rightToLeft
    if (difference < 0) difference = -difference
    return difference
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}