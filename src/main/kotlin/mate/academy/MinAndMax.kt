package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val result: IntArray = IntArray(2)
    result[0] = inputArray[0] //min
    result[1] = inputArray[1] //max
    for (i in 1 until inputArray.size - 1) {
        if (inputArray[i] > result[1]) result[1] = inputArray[i]
        if (inputArray[i] < result[0]) result[0] = inputArray[i]
    }
    return result
}
