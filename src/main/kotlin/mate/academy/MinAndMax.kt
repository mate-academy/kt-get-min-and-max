package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val minValue = inputArray.min()
    val maxValue = inputArray.max()
    return intArrayOf(minValue, maxValue)
}
