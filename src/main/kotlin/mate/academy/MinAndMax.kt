package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val minNum = inputArray.min()
    val maxVal = inputArray.max()

    return intArrayOf(minNum, maxVal)
}
