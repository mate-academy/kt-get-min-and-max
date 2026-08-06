package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val sortedArray = inputArray.sorted()
    return intArrayOf(sortedArray.first(), sortedArray.last())
}
