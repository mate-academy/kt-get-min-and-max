package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {

   val minValue = inputArray.minOrNull()
    val maxValue = inputArray.maxOrNull()

    return intArrayOf(minValue!!, maxValue!!)
}
