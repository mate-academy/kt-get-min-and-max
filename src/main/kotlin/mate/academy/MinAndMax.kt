package mate.academy

private const val FIRST_INDEX = 0

fun getMinAndMax(inputArray: IntArray): IntArray {
    val sortedArray = inputArray.sortedArray()
    return intArrayOf(sortedArray[FIRST_INDEX], sortedArray[sortedArray.lastIndex])
}
