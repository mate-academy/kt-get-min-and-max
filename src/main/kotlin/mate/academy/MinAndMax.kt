package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val resultArray = IntArray(2)
    if (inputArray.isEmpty()) {
        return resultArray
    }
    resultArray[0] = inputArray[0];
    resultArray[1] = inputArray[0];
    for (i in 0 until inputArray.size) {
        if (resultArray[0] > inputArray[i]) {
            resultArray[0] = inputArray[i];
        }
    }
    for (i in 0 until inputArray.size) {
        if (resultArray[0] < inputArray[i]) {
            resultArray[1] = inputArray[i];
        }
    }
    return resultArray;
}
