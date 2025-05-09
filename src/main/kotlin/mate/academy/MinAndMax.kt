package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val result = IntArray(2)

    if (inputArray.size == 1) {
        result[0] = inputArray[0]
        result[1] = inputArray[0]
        return result
    }
    var min = inputArray[0]
    var max = inputArray[0]
    for (i in 1 until inputArray.size) {
        if (inputArray[i] <= min) {
            min = inputArray[i]
        } else {
            max = inputArray[i]
        }
        result[0] = min
        result[1] = max
    }
        return result
}
