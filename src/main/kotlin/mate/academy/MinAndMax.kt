package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var min = inputArray[0]
    var max = inputArray[0]

    for (number in inputArray) {
        min = minOf(min, number)
        max = maxOf(max, number)
    }
    return intArrayOf(min, max)
}
