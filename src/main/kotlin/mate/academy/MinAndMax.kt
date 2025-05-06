package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var min = inputArray[0]
    var max = inputArray[0]

    val result = IntArray(2)

    for (i in inputArray) {
        if (i < min) {
            min = i
        }
        if (i > max) {
            max = i
        }
    }
    result[0] = min
    result[1] = max

    return result
}

