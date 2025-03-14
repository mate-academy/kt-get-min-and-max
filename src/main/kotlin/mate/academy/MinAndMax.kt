package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    return intArrayOf(inputArray.minOrNull() ?: 0, inputArray.maxOrNull() ?: 0);
}
