package domains.algorithms.implementation

/**
 * @link https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true
 *
 * Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
 *
 * Lily decides to share a contiguous segment of the bar selected such that:
 *
 * - The length of the segment matches Ron's birth month, and,
 * - The sum of the integers on the squares is equal to his birthday.
 * Determine how many ways she can divide the chocolate.
 *
 * Example
 * -------
 * s = [2,2,1,3,2]
 * d = 4
 * m = 2
 * Lily wants to find segments summing to Ron's birthday, d = 4 with a length equalling his birth month, m = 2.
 * In this case, there are two segments meeting her criteria: [2,2] and [1,3].
 */

fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    val size = s.size
    var matches = 0

    for (i in 0 until size) {
        val j = i + m
        if (j > size) break

        val sum = s.slice(i until j).sum()
        if (sum == d) matches++
    }

    return matches
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val d = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}