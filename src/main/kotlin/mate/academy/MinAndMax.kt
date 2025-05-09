package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var min = inputArray[0]
    var max = inputArray[0]
    val array = IntArray(2)
    for (num in inputArray) {
        if (num > max) {
            max = num
        }
        if (num < min) {
            min = num
        }
    }
    array[0] = min
    array[1] = max
    return array
}
