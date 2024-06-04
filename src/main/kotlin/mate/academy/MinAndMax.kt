package mate.academy
const val CAPACITY_ARRAY = 2
fun getMinAndMax(inputArray: IntArray): IntArray {
    val minMax = IntArray(CAPACITY_ARRAY)
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE

    for (input in inputArray) {
        if (input < min) {
            min = input
        }

        if (input > max) {
            max = input
        }
    }

    minMax[0] = min
    minMax[1] = max

    return minMax
}
