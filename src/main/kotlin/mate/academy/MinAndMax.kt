package mate.academy

private const val RESULT_ARRAY_SIZE = 2

private const val MAX_INDEX = 1

private const val MIN_INDEX = 0

fun getMinAndMax(inputArray: IntArray): IntArray {
    val resultArray: IntArray = IntArray(RESULT_ARRAY_SIZE) {0}

    resultArray[0] = Int.MAX_VALUE
    resultArray[1] = Int.MIN_VALUE

    for (i in 0 .. inputArray.size - 1) {
        if (inputArray[i] > resultArray[MAX_INDEX]) {
            resultArray[MAX_INDEX] = inputArray[i]
        }
        if (inputArray[i] < resultArray[MIN_INDEX]) {
            resultArray[MIN_INDEX] = inputArray[i]
        }
    }
    return resultArray
}
