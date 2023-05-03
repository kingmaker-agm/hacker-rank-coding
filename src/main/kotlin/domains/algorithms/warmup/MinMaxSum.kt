package domains.algorithms.warmup

fun miniMaxSum(arr: Array<Int>): Unit {
    val max = arr.max()
    val min = arr.min()
    val sum = arr.map { it.toLong() }.sum()

    print("${sum - max} ${sum - min}")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}