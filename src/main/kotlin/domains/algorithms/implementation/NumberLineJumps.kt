package domains.algorithms.implementation

/**
 * @link https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true
 *
 * You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line
 * ready to jump in the positive direction (i.e, toward positive infinity).
 *
 * The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
 * The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
 * You have to figure out a way to get both kangaroos at the same location at the same time as part of the show.
 * If it is possible, return YES, otherwise return NO.
 *
 * Example
 * -------
 * x1 = 2
 * v1 = 1
 * x2 = 1
 * v2 = 2
 *
 * After one jump, they are both at x=3, (x1+v1 = 2+1, x2+v2 = 1+2), so the answer is YES.
 */

const val YES = "YES"
const val NO = "NO"

data class Kangaroo(val initialPosition: Int, val speed: Int) {
    var position = initialPosition

    fun jump(): Unit {
        position += speed
    }

    fun getPosition(nthJump: Int) = initialPosition + nthJump * speed

    operator fun compareTo(kangaroo: Kangaroo): Int = this.position - kangaroo.position
}

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    if (v1 == v2) {
        return if (x1 == x2) YES else NO
    }

    val kangaroo1 = Kangaroo(x1, v1)
    val kangaroo2 = Kangaroo(x2, v2)
    val kangaroos: List<Kangaroo> = listOf(kangaroo1, kangaroo2)
    val fastestKangaroo = if (kangaroo1.speed > kangaroo2.speed) kangaroo1 else kangaroo2
    val slowestKangaroo = if (fastestKangaroo == kangaroo1) kangaroo2 else kangaroo1

    if (slowestKangaroo.position < fastestKangaroo.position) return NO

    while (true) {
        if (fastestKangaroo > slowestKangaroo) return NO
        else if (fastestKangaroo.position == slowestKangaroo.position) return YES

        kangaroos.forEach { it.jump() }
    }
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val x1 = first_multiple_input[0].toInt()

    val v1 = first_multiple_input[1].toInt()

    val x2 = first_multiple_input[2].toInt()

    val v2 = first_multiple_input[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}

