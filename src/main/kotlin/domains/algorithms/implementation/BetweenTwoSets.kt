package domains.algorithms.implementation

/**
 * @link https://www.hackerrank.com/challenges/between-two-sets/problem?isFullScreen=true
 *
 * There will be two arrays of integers. Determine all integers that satisfy the following two conditions:
 *
 * 1. The elements of the first array are all factors of the integer being considered
 * 2. The integer being considered is a factor of all elements of the second array
 * These numbers are referred to as being between the two arrays. Determine how many such numbers exist.
 *
 * Example
 * -------
 * a = [2,6]
 * b = [24,26]
 * There are two numbers between the arrays: 6 and 12.
 * 6%2 = 0, 6%6 = 0, 24%6 = 0 and 36%6 = 0 for the first value.
 * 12%2 = 0, 12%6 = 0 and 24%12 = 0, 36%12 = 0 for the second value. Return .
 *
 * Sample Input
 * ------------
 * 2 3
 * 2 4
 * 16 32 96
 *
 * Sample Output
 * -------------
 * 3
 *
 * Explanation
 * -----------
 * 2 and 4 divide evenly into 4, 8, 12 and 16.
 * 4, 8 and 16 divide evenly into 16, 32, 96.
 *
 * 4, 8 and 16 are the only three numbers for which each element of a is a factor and each is a factor of all elements of b.
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    val maxOfFirst = a.max()
    val minOfSecond = b.min()

    val factors = (maxOfFirst..minOfSecond)
        .filter {possible -> a.all { possible % it == 0 } }

    return factors.filter {factor -> b.all { it % factor == 0 } }.size
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}