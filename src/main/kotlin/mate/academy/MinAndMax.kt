package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val max = inputArray.max()
    val min = inputArray.min()
    val array = intArrayOf(min, max)
    return array
}
