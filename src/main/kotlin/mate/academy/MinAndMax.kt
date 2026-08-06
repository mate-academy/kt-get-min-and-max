package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    require(inputArray.isNotEmpty()) { "Input array must not be empty" }

    var min = inputArray[0]
    var max = inputArray[0]

    for (num in inputArray) {
        if (num < min) {
            min = num
        }
        if (num > max) {
            max = num
        }
    }

    return intArrayOf(min, max)
}


