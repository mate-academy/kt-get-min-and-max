package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var min: Int = inputArray[0]
    var max: Int = inputArray[0]
    for (i in inputArray) {
        if (i < min) {
            min = i
        }
        if (i > max) {
            max = i
        }
    }
   return intArrayOf(min,max)
}
