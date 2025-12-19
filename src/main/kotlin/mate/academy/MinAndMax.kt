package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var min = inputArray[0]
    var max = inputArray[0]
    for (i in 0 until inputArray.size) {
        if (inputArray.get(i) > max) {
            max = inputArray.get(i)
        }
        if (inputArray.get(i) < min) {
            min = inputArray.get(i)
        }
    }
    return intArrayOf(min, max)
}
