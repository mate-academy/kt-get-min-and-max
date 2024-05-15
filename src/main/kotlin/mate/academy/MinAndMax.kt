package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    if (inputArray.isEmpty()) {
        throw IllegalArgumentException("Input array is empty")
    }

    inputArray.sort()

    return intArrayOf(inputArray[0], inputArray[inputArray.size - 1])
}
