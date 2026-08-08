package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val min = inputArray.minOrNull() ?: 0
    val max = inputArray.maxOrNull() ?: 0
    return intArrayOf(min, max)
}
