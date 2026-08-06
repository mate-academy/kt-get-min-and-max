package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val outputArray = IntArray(2)
    if (inputArray.isEmpty()) {
        return outputArray
    }
    outputArray[0] = inputArray[0]
    outputArray[1] = inputArray[0]

    inputArray.forEach {e ->
        if (e < outputArray[0]) {
            outputArray[0] = e
        }
        if (e > outputArray[1]) {
            outputArray[1] = e
        }
    }

    return outputArray
}
