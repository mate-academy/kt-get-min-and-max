package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    if (inputArray.isEmpty()) {
        return intArrayOf()
    }
    val min = inputArray.minOrNull() ?: Int.MAX_VALUE
    val max = inputArray.maxOrNull() ?: Int.MIN_VALUE
    return intArrayOf(min, max)
}
