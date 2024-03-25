package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val min = inputArray.minOrNull()!!
    val max = inputArray.maxOrNull()!!

    return intArrayOf(min, max)
}
