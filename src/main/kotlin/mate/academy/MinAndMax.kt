package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var minNumber = inputArray[0]
    var maxNumber = inputArray[0]

    for (i in inputArray.indices) {
        if (inputArray[i] < minNumber) {
            minNumber = inputArray[i]
        }
        if (inputArray[i] > maxNumber) {
            maxNumber = inputArray[i]
        }
    }

    return intArrayOf(minNumber, maxNumber)
}
