package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val min = getMin(inputArray)
    val max = getMax(inputArray)
    val result = intArrayOf(min, max)
    return result
}

fun getMax(inputArray: IntArray): Int {
    var max = Int.MIN_VALUE
    inputArray.forEach { i ->
        if (i > max) {
            max = i
    }
    }
    return max
}
fun getMin(inputArray: IntArray): Int {
    var min = Int.MAX_VALUE
    inputArray.forEach { i ->
        if (i < min) {
        min = i
    }
    }
    return min
}
