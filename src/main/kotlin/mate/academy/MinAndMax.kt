package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val max = inputArray.max()
    val min = inputArray.min()
    return intArrayOf(min,max)
}
