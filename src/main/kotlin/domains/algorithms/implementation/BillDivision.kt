package domains.algorithms.implementation

/**
 * @link https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true
 *
 * Two friends Anna and Brian, are deciding how to split the bill at a dinner. Each will only pay for the items they
 * consume. Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.
 *
 * For example, assume the bill has the following prices: bill = [2,4,6]. Anna declines to eat item k = bill[2] which
 * costs 6. If Brian calculates the bill correctly, Anna will pay (2+4)/2 = 3. If he includes the cost of bill[2],
 * he will calculate (2+4+6)/2 = 6. In the second case, he should refund 3 to Anna.
 *
 * Input Format
 * ------------
 * The first line contains two space-separated integers n and k, the number of items ordered and the 0-based index of
 * the item that Anna did not eat.
 * The second line contains n space-separated integers bill[i] where 0<=i<n.
 * The third line contains an integer, b, the amount of money that Brian charged Anna for her share of the bill.
 *
 * Output Format
 * -------------
 * If Brian did not overcharge Anna, print Bon Appetit on a new line; otherwise, print the difference
 * (i.e.,bCharged - bActual ) that Brian must refund to Anna. This will always be an integer.
 */
fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    val bCharged = b
    val bActual: Int = bill.toList().filterIndexed { index, i -> index != k }.sum() / 2

    val remaining = bCharged - bActual
    if (remaining == 0) print("Bon Appetit") else print(remaining)
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}