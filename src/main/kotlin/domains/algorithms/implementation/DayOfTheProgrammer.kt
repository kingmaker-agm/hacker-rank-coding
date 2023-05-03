package domains.algorithms.implementation

/**
 * @link https://www.hackerrank.com/challenges/day-of-the-programmer/problem?isFullScreen=true
 *
 * Marie invented a Time Machine and wants to test it by time-traveling to visit Russia on the Day of the Programmer
 * (the 256th day of the year) during a year in the inclusive range from 1700 to 2700.
 *
 * From 1700 to 1917, Russia's official calendar was the Julian calendar; since 1919 they used the Gregorian
 * calendar system. The transition from the Julian to Gregorian calendar system occurred in 1918, when the next day
 * after January 31st was February 14th. This means that in 1918, February 14th was the 32nd day of the year in Russia.
 *
 * In both calendar systems, February is the only month with a variable amount of days; it has 29 days during a leap
 * year, and 28 days during all other years. In the Julian calendar, leap years are divisible by 4; in the Gregorian
 * calendar, leap years are either of the following:
 *
 * - Divisible by 400.
 * - Divisible by 4 and not divisible by 100.
 *
 * Given a year y, find the date of the 256th day of that year according to the official Russian calendar during that
 * year. Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is y
 *
 * For example, the given year = 1984. 1984 is divisible by 4, so it is a leap year. The 256th day of a leap year after
 * 1918 is September 12, so the answer is 12.09.1984.
 *
 * Output Format
 * -------------
 * Print the full date of Day of the Programmer during year  in the format dd.mm.yyyy, where dd is the two-digit day,
 * mm is the two-digit month, and yyyy is .
 *
 * Sample Input 0
 * --------------
 * 2017
 *
 * Sample Output 0
 * ---------------
 * 13.09.2017
 *
 * Explanation 0
 * -------------
 * In the year y = 2017, January has 31 days, February has 28 days, March has 31 days, April has 30 days, May has
 * 31 days, June has 30 days, July has 31 days, and August has 31 days. When we sum the total number of days in the
 * first eight months, we get 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 = 243. Day of the Programmer is the 256th day,
 * so then calculate 256 - 243 = 13 to determine that it falls on day 13 of the 9th month (September).
 * We then print the full date in the specified format, which is 13.09.2017.
 */

sealed interface Calendar {
    fun isLeapYear(year: Int): Boolean

    fun getCalendarDays(year: Int): List<Int>

    fun getFullDate(day: Int, year: Int): String
}

object JulianCalendar : Calendar {
    override fun isLeapYear(year: Int): Boolean = year % 4 == 0

    override fun getCalendarDays(year: Int): List<Int> = listOf(31, if(isLeapYear(year)) 29 else 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    override fun getFullDate(day: Int, year: Int): String {
        val monthlyDays = getCalendarDays(year)
        var daysRemaining = day
        var month = 1

        for (monthDays in monthlyDays) {
            if (daysRemaining < monthDays) break
            daysRemaining -= monthDays
            month++
        }

        return "${daysRemaining.toString().padStart(2, '0')}.${month.toString().padStart(2, '0')}.$year"
    }
}

object GregorianCalendar: Calendar {
    override fun isLeapYear(year: Int): Boolean {
        if (year % 400 == 0) return true
        if (year % 100 == 0) return false
        return year % 4 == 0
    }

    override fun getCalendarDays(year: Int): List<Int> = listOf(31, if(isLeapYear(year)) 29 else 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    override fun getFullDate(day: Int, year: Int): String {
        val monthlyDays = getCalendarDays(year)
        var daysRemaining = day
        var month = 1

        for (monthDays in monthlyDays) {
            if (daysRemaining < monthDays) break
            daysRemaining -= monthDays
            month++
        }

        return "${daysRemaining.toString().padStart(2, '0')}.${month.toString().padStart(2, '0')}.$year"
    }
}

object TransitionCalendar: Calendar {
    override fun isLeapYear(year: Int): Boolean {
        if (year != 1918) throw IllegalArgumentException("Transition happened over 1918")
        return false
    }

    override fun getCalendarDays(year: Int): List<Int> {
        if (year != 1918) throw IllegalArgumentException("Transition happened over 1918")

        return listOf(31, 15, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    }

    override fun getFullDate(day: Int, year: Int): String {
        val monthlyDays = getCalendarDays(year)
        var daysRemaining = day
        var month = 1

        for (monthDays in monthlyDays) {
            if (daysRemaining < monthDays) break
            daysRemaining -= monthDays
            month++
        }

        return "${(if(month == 2) daysRemaining + 13 else daysRemaining).toString().padStart(2, '0')}.${month.toString().padStart(2, '0')}.$year"
    }
}

fun dayOfProgrammer(year: Int): String {
    val programmerDay = 256

    return when(year) {
        1918 -> TransitionCalendar.getFullDate(programmerDay, year)
        in 1700..1917 -> JulianCalendar.getFullDate(programmerDay, year)
        in 1919..2700 -> GregorianCalendar.getFullDate(programmerDay, year)
        else -> throw IllegalArgumentException("Year is not within the expected range")
    }
}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}