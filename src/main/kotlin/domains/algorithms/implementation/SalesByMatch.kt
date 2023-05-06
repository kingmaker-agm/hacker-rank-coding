package domains.algorithms.implementation

/**
 * @link https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true
 *
 * There is a large pile of socks that must be paired by color. Given an array of integers representing the color of
 * each sock, determine how many pairs of socks with matching colors there are.
 *
 * Example
 * -------
 * n = 7
 * ar = [1,2,1,2,1,3,2]
 *
 * There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color.
 * The number of pairs is 2.
 */
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val list = mutableListOf<Int>()
    var pairs = 0
    ar.forEach {
        if (list.contains(it)) {
            pairs++
            list.remove(it)
        }
        else {
            list.add(it)
        }
    }

    return pairs
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}