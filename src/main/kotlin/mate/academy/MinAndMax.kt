package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    if (inputArray.isEmpty()) return intArrayOf()

    val min = inputArray.minOrNull() ?: return intArrayOf()
    val max = inputArray.maxOrNull() ?: return intArrayOf()

    return intArrayOf(min, max)
}
