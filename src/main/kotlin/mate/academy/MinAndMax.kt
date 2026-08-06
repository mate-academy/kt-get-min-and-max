package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    inputArray.sort()
    return intArrayOf (inputArray[0], inputArray[inputArray.size - 1])
}
