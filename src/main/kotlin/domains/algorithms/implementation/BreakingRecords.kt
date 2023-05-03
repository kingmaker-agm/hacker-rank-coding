package domains.algorithms.implementation

/**
 * @link https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true
 *
 * Maria plays college basketball and wants to go pro. Each season she maintains a record of her play.
 * She tabulates the number of times she breaks her season record for most points and least points in a game.
 * Points scored in the first game establish her record for the season, and she begins counting from there.
 *
 * Example
 * -------
 * scores = [12,24,10,24]
 *
 * Scores are in the same order as the games played. She tabulates her results as follows:
 *
 *                                      Count
 *     Game  Score  Minimum  Maximum   Min Max
 *      0      12     12       12       0   0
 *      1      24     12       24       0   1
 *      2      10     10       24       1   1
 *      3      24     10       24       1   1
 *
 * Given the scores for a season, determine the number of times Maria breaks her records for most and least points
 * scored during the season.
 */
fun breakingRecords(scores: Array<Int>): Array<Int> {
    if (scores.isEmpty()) throw IllegalArgumentException("Scores can't be an Empty array")

    // Write your code here
    var minScore = scores[0]
    var maxScore = scores[0]
    var minRecord = 0
    var maxRecord = 0

    for (i in 1 until scores.size) {
        val currentScore = scores[i]

        if (currentScore < minScore) {
            minRecord++
            minScore = currentScore
        }
        else if (currentScore > maxScore) {
            maxRecord++
            maxScore = currentScore
        }
    }

    return arrayOf(maxRecord, minRecord)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}