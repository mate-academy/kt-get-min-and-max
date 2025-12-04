package mate.academy

fun main() {
    val inputArray: IntArray = intArrayOf(72, 4, -7, 33, 3, 9)
    println(getMinAndMax(inputArray).contentToString())
}

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
