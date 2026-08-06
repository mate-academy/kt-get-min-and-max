package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val from = 1
    var min = inputArray[0]
    var max = inputArray[0]
    for (i in from until inputArray.size) {
        if (min > inputArray[i]) {
            min = inputArray[i]
        }
        if (max < inputArray[i]) {
            max = inputArray[i]
        }
    }
    return intArrayOf(min, max)
}
