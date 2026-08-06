package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    require(inputArray.isNotEmpty()) { "Array must not be empty" }

    val min = inputArray.minOrNull() ?: error("Error finding minimum value")
    val max = inputArray.maxOrNull() ?: error("Error finding maximum value")

    return intArrayOf(min, max)
}
