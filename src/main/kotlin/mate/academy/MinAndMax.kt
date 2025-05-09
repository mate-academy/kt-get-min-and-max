package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    require(inputArray.isNotEmpty()) { "Input array is empty" }

    inputArray.sort()

    return intArrayOf(inputArray[0], inputArray[inputArray.size - 1])
}
