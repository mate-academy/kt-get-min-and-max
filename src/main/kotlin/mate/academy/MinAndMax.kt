package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val result = intArrayOf(inputArray[0], inputArray[0])
    for (i in inputArray) {
        if (i < result[0]) {
            result[0] = i
        }
        if (i > result[1]) {
            result[1] = i
        }
    }
    return result
}
