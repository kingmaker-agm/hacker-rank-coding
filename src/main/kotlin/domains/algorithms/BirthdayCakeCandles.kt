package domains.algorithms

/**
 * @link https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
 *
 * You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age.
 * They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
 *
 * Example
 * -------
 * Candles = [4, 4, 1, 3]
 * The maximum height candles are 4 units high. There are 2 of them, so return 2.
 */
fun birthdayCakeCandles(candles: Array<Int>): Int {
    val maxHeight = candles.max()

    return candles.count { it == maxHeight }
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}