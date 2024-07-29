package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    if (inputArray.isEmpty()) {
        throw IllegalArgumentException("Input array cannot be empty")
    }
    val min = inputArray.minOrNull() ?: throw IllegalStateException("Unexpected error: minOrNull returned null")
    val max = inputArray.maxOrNull() ?: throw IllegalStateException("Unexpected error: maxOrNull returned null")

    return intArrayOf(min, max)
}
