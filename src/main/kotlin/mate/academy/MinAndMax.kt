package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    if (inputArray.isEmpty()) {
        throw IllegalArgumentException("Input array must not be empty")
    }

    val result = IntArray(2)
    val min = inputArray.minOrNull() ?: inputArray[0]
    val max = inputArray.maxOrNull() ?: inputArray[0]

    result[0] = min
    result[1] = max

    return result
}
