package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var max = inputArray.get(0)
    var min = inputArray.get(0)

    for (i in inputArray) {
        if (i < min) {
            min = i
        }
        if (i > max) {
            max = i
        }
    }
    return intArrayOf(min, max)
}
