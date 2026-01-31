package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    if (inputArray.isEmpty()) {
        return IntArray(2)
    }
    var result = IntArray(2)
    result[0] = inputArray[0]
    result[1] = inputArray[0]
    for (num in inputArray) {
        if (num < result[0]) {
            result[0] = num
        }
        if (num > result[1]) {
            result[1] = num
        }
    }
    return result
}
