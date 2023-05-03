package domains.algorithms.warmup

/**
 * @link https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true
 *
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 *
 * Note:
 * -----
 * - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 * - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 *
 * Sample Input 0
 * --------------
 * 07:05:45PM
 *
 * Sample Output 0
 * ---------------
 * 19:05:45
 */
fun timeConversion(s: String): String {
    val regex12Hour = Regex("(\\d\\d):(\\d\\d):(\\d\\d)(AM|PM)")
    if (regex12Hour.matchEntire(s) === null) throw IllegalArgumentException("Invalid 12 hour format string")

    val matches = regex12Hour.find(s)
    val (_, hour, minute, second, meridian) = matches!!.groupValues

    val resultingMinute: String = minute
    val resultingSecond: String = second
    val resultingHour: String = when(meridian) {
        "AM" -> if (hour == "12") "00" else hour
        "PM" -> if (hour == "12") "12" else (hour.toInt() + 12).toString()
        else -> throw Exception("Not Possible")
    }

    return "$resultingHour:$resultingMinute:$resultingSecond"
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}