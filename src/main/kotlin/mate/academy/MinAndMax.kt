package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    require(inputArray.isNotEmpty()) { "Array must not be empty" }
    val min = inputArray.minOrNull() ?: throw IllegalArgumentException("Array must not be empty")
    val max = inputArray.maxOrNull() ?: error("Array must not be empty")
    return intArrayOf(min, max)
}
