package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var minValue = inputArray[0]
    var maxValue = inputArray[0]
    for (i in inputArray.indices) {
        if (inputArray[i] < minValue) {
            minValue = inputArray[i]
        }
        if (inputArray[i] > maxValue) {
            maxValue = inputArray[i]
        }
    }

    return intArrayOf(minValue, maxValue)
}
