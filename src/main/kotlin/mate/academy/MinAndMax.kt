package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {

    if (inputArray.isEmpty()) {
        throw IllegalArgumentException("Array must not be empty")
    }

    val minValue = inputArray.minOrNull() ?: 0
    val maxValue = inputArray.maxOrNull() ?: 0

    return intArrayOf(minValue, maxValue)
}
