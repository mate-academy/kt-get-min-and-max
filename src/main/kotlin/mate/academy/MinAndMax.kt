package mate.academy

const val RESULT_SIZE = 2

fun getMinAndMax(inputArray: IntArray): IntArray {
    val result = IntArray(RESULT_SIZE) {0}
    var temp = inputArray[0]
    for (i in 1..inputArray.size - 1) {
        if (inputArray[i] < temp) {
            temp = inputArray[i]
        }
    }
    result.set(0, temp)
    temp = inputArray[0]
    for (i in 1..inputArray.size - 1) {
        if (inputArray[i] > temp) {
            temp = inputArray[i]
        }
    }
    result.set(1, temp)
    return result
}
