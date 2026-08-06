package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var min :Int = inputArray[0]
    var max :Int = inputArray[0]
    for (i in 1 until inputArray.size) {
        if (inputArray[i] < min) {
            min = inputArray[i]
        }
        if (inputArray[i] > max) {
            max = inputArray[i]
        }
    }
    return intArrayOf(min, max)
}
