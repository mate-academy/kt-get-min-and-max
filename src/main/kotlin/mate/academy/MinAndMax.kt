package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    if (inputArray.isEmpty()) {
        return intArrayOf()
    }
    var min = inputArray[0]
    var max = inputArray[0]

    for (i in 1 until inputArray.size) {
        if (inputArray[i] > max) {
            max = inputArray[i]
        }
        if (inputArray[i] < min) {
            min = inputArray[i]
        }
    }
    return intArrayOf(min, max)
}
