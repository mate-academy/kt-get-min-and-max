package mate.academy

private const val SIZE = 2

private const val MIN_INDEX = 0

private const val MAX_INDEX = 1

fun getMinAndMax(inputArray: IntArray): IntArray {
    val res = IntArray(SIZE)
    res[MIN_INDEX] = inputArray.min()
    res[MAX_INDEX] = inputArray.max()
    return res
}
