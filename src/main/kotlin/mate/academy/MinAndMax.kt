package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val outArray = intArrayOf(inputArray[0],inputArray[0])

    for (i in inputArray.indices) {
        if (outArray[0] > inputArray[i]) {
            outArray[0] = inputArray[i]
        }
        if (outArray[1] < inputArray[i]) {
            outArray[1] = inputArray[i]
        }
    }
return outArray
}

