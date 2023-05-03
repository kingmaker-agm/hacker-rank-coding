package domains.algorithms

/**
 * @link https://www.hackerrank.com/challenges/staircase/problem?isFullScreen=true
 *
 * Staircase detail
 *
 * This is a staircase of size : n = 4
 *    #
 *   ##
 *  ###
 * ####
 */

fun staircase(n: Int): Unit {
    val range = 1 .. n
    for (i in range) {
        for (j in range)
            if (j <= n - i) print(" ") else print("#")
        println()
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}