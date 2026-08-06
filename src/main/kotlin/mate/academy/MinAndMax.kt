package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {

    if (inputArray.isEmpty()) {
        return intArrayOf()
    }

    var minValue = inputArray[0]
    var maxValue = inputArray[0]

    for (number in inputArray) {

        if (number < minValue) {
            minValue = number
        }
        if (number > maxValue) {
            maxValue = number
        }
    }

    return intArrayOf(minValue, maxValue)
}
