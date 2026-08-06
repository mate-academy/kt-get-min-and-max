package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var min = inputArray[0]
    var max = inputArray[0]
    val resultArray : IntArray = IntArray(2) {0}
    for (num in inputArray) {
        if (num > max) {
            max = num
        }
        if (num < min) {
            min = num
        }
    }
    resultArray[0] = min
    resultArray[1] = max
    return resultArray;
}
