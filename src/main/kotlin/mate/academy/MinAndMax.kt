package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val min = inputArray.min()
    val max = inputArray.max()
    return intArrayOf(min, max)
}
