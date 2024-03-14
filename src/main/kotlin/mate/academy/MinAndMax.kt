package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var max: Int = inputArray[0]
    var min: Int = inputArray[0]
    inputArray.forEach { if (it > max) max = it else if (it < min) min = it }
    return intArrayOf(min, max)
}
