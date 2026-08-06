package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    return intArrayOf(
        inputArray.minOrNull() ?: throw IllegalArgumentException("Array is empty"),
        inputArray.maxOrNull() ?: throw IllegalArgumentException("Array is empty"))
}
