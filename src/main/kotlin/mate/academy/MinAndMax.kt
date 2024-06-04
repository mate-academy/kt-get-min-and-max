package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
val minMax : IntArray = IntArray((2) {0})
    val minMax = IntArray(2) { 0 }
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
