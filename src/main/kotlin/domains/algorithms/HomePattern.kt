package domains.algorithms

/**
 * Print the pattern with dynamic n = 5
 *   *
 *  ***
 * *****
 * @   @
 * @   @
 * @   @
 * @ * @
 * @***@
 * *****
 */
fun main() {
    val n = readln().toInt()

    if (n <= 1 || n % 2 == 0) throw Exception("Only Odd numbers greater than 1 are allowed")

    for (i in 1..n step 2) {
        val center = (n - 1) / 2 + 1
        val step = (i - 1) / 2
        val starRange = center-step..center+step
        for (j in 1..n) {
            print(if(j in starRange) '*' else ' ')
        }
        println()
    }

    for (i in 1..n) {
        val halfMarkLine = (n+1) / 2
        val spaceBetween = n - 2

        var line = "@"
        // Intermediate space
        if (i <= halfMarkLine) {
            line += (1..spaceBetween).map { ' ' }.joinToString("")
        }
        else {
            val starLine = i - halfMarkLine
            val stars = starLine * 2 - 1
            val center = (spaceBetween - 1) / 2 + 1
            val starRange = center-starLine+1..center+starLine-1
            for (j in 1..spaceBetween) {
                line += if(j in starRange) '*' else ' '
            }
        }
        line += "@"
        println(line)
    }

    println((1..n).map { "*" }.joinToString(""))
}