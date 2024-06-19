package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val sortedArray = inputArray.sortedArray()
    return arrayOf(sortedArray.first(), sortedArray.last()).toIntArray()
}
