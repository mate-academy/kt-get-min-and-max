package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var min = inputArray[0]
    var max = inputArray[0]

    for (value in inputArray) {
        max = Math.max(max, value)
        min = Math.min(min, value)
    }

    return intArrayOf(min, max);
}
