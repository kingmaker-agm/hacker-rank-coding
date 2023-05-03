package domains.algorithms.warmup

/**
 * @link https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 *
 * In this challenge, you are required to calculate and print the sum of the elements in an array,
 * keeping in mind that some of those integers may be quite large.
 *
 * Function Description
 * ---------------------
 * Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
 * aVeryBigSum has the following parameter(s):
 *
 * - int ar[n]: an array of integers .
 *
 * Return
 * ------
 * long: the sum of all array elements
 *
 * Input Format
 * ------------
 * The first line of the input consists of an integer .
 * The next line contains  space-separated integers contained in the array.
 *
 * Output Format
 * -------------
 * Return the integer sum of the elements in the array.
 *
 * Sample Input
 * ------------
 * 5
 * 1000000001 1000000002 1000000003 1000000004 1000000005
 *
 * Output
 * ------
 * 5000000015
 */

fun aVeryBigSum(ar: Array<Long>): Long = ar.toList().fold(0L) { sum, number -> sum + number}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}