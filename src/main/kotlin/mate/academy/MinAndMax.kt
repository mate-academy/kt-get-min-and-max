package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var min = inputArray[0]
    var max = inputArray[0]

    for (num in inputArray) {
        if (num < min) min = num
        if (num > max) max = num
    }
    return intArrayOf(min, max)
}
