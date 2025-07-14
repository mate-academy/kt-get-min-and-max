package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var min = inputArray.get(0)
    var max = inputArray.get(0)
    for (i in 1 until inputArray.size step 1) {
        if (inputArray[i] > max) {
            max = inputArray[i]
        }
        if (inputArray[i] < min) {
            min = inputArray[i]
        }
    }
    return intArrayOf(min, max)
}
