package mate.academy

const val FIRST_ITEM = 0

fun getMinAndMax(inputArray: IntArray): IntArray {
    var max = inputArray[FIRST_ITEM]
    var min = inputArray[FIRST_ITEM]
    for (i in inputArray.indices) {
        if (inputArray[i] > max) {
            max = inputArray[i]
        }
        if (inputArray[i] < min) {
            min = inputArray[i]
        }
    }
    return intArrayOf(min,max)
}
