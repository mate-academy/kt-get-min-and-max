package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val minValue = inputArray.minOrNull() ?: throw IllegalArgumentException("Array cannot be empty")
    val maxValue = inputArray.maxOrNull() ?: throw IllegalArgumentException("Array cannot be empty")

    return intArrayOf(minValue, maxValue)
}
