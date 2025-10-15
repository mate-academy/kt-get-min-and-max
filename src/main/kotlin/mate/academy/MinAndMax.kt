package mate.academy

var min = 0
var max = 0

fun getMinAndMax(inputArray: IntArray): IntArray {
    if (inputArray.isNotEmpty()) {
        min = inputArray[0]
        max = inputArray[0]

        for (num in inputArray) {
            if (num < min) {
                min = num
            }
            if (num > max) {
                max = num
            }
        }
    }

    return intArrayOf(min, max)
}
