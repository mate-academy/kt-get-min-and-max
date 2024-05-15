package mate.academy

const val ZERO_INDEX = 0
const val FIRST_INDEX = 1
const val ARRAY_SIZE = 2

fun getMinAndMax(inputArray: IntArray): IntArray {
    val result = IntArray(ARRAY_SIZE)
    result[ZERO_INDEX] = inputArray.min()
    result[FIRST_INDEX] = inputArray.max()
    return result
}
