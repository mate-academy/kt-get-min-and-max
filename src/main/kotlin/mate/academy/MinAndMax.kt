package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val sortedArray = inputArray.sortedArray()
    return intArrayOf(sortedArray[0], sortedArray[sortedArray.size - 1])
}
