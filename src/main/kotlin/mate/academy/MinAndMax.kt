package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var maxValue = inputArray[0]
    var minValue = inputArray[0]
    for (i in 0 until inputArray.size) {
        val value = inputArray[i]
        if (value > maxValue) {
            maxValue = value
        }
        if (value < minValue) {
            minValue = value
        }
    }
    return intArrayOf(minValue, maxValue)
}
