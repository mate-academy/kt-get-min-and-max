package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val arr = IntArray(2)
    var min = inputArray[0]
    var max = inputArray[0]
    for (i in 1 until inputArray.size) {
        if (inputArray[i] > max) {
            max = inputArray[i]
        }
        if (inputArray[i] < min) {
            min = inputArray[i]
        }
    }
    arr[0] = min
    arr[1] = max
    return arr
}
