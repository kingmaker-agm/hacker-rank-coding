package domains.algorithms

/**
 * @link https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true
 *
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
 * Print the decimal value of each fraction on a new line with  places after the decimal.
 *
 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal places,
 * though answers with absolute error of up to  are acceptable.
 */
data class Ratios (val positive: Float, val negative: Float, val zero: Float)

fun plusMinus(arr: Array<Int>): Ratios {
    var positive = 0f
    var negative = 0f
    var zero = 0f

    arr.forEach {
        if (it > 0) positive++
        else if(it < 0) negative++
        else zero++
    }

    val total = arr.size
    return Ratios(positive / total, negative / total, zero / total)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val (positive, negative, zero) = plusMinus(arr)
    println(String.format("%.6f", positive))
    println(String.format("%.6f", negative))
    println(String.format("%.6f", zero))
}