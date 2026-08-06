package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    require(inputArray.isNotEmpty()) { "Array must not be empty" }
    val min = inputArray.minOrNull()!!
    val max = inputArray.maxOrNull()!!
    return intArrayOf(min, max)
}
