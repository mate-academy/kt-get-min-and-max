package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    for (i in inputArray.indices) {
        if (inputArray[i] > max) {
            max = inputArray[i]
        }
        if (inputArray[i] < min) {
            min = inputArray[i]
        }
    }
    return intArrayOf(min, max)
}
