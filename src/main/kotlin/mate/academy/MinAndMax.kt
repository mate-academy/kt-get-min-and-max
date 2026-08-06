package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var min = inputArray[0]
    var max = inputArray[0]
    for (i in inputArray) {
        if (min > i) min = i
        if (max < i) max = i
    }
    return intArrayOf(min, max)
}
