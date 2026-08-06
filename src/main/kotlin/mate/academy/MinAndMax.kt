package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var highest: Int = inputArray.get(0)
    var lowest: Int = inputArray.get(0)
    for (i in 0 until inputArray.size) {
        if (inputArray.get(i) > highest) {
            highest = inputArray.get(i)
        }
        if (inputArray.get(i) < lowest) {
            lowest = inputArray.get(i)
        }
    }
    return intArrayOf(lowest, highest)
}
