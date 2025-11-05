package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {

    require(inputArray.isNotEmpty()) { "Array must not be empty" }

    val minValue = inputArray.minOrNull() ?: 0
    val maxValue = inputArray.maxOrNull() ?: 0

    return intArrayOf(minValue, maxValue)
}
