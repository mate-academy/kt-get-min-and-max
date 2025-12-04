package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var min: Int = inputArray[0]
    var max: Int = min
    for (i in 0 until inputArray.size) {
        if (inputArray[i] > max) {
            max = inputArray[i]
        } else if (inputArray[i] < min){
            min = inputArray[i]
        }
    }
    return intArrayOf(min, max)
}
