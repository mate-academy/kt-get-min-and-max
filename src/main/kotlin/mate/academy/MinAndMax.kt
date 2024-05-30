package mate.academy

private const val ARRAY_SIZE: Int = 2

fun getMinAndMax(inputArray: IntArray): IntArray {
    return intArrayOf(inputArray.min(), inputArray.max())
}
