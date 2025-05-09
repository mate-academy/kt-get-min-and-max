package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    if (inputArray.isEmpty() || inputArray.minOrNull() == null || inputArray.maxOrNull() == null) {
        return intArrayOf()
    }

    return intArrayOf(inputArray.minOrNull()!!, inputArray.maxOrNull()!!)
}
