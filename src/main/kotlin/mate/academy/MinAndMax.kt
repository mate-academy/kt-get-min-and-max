package mate.academy

const val DEFAULT_SIZE = 2
fun getMinAndMax(inputArray: IntArray): IntArray {
    val arr = IntArray(DEFAULT_SIZE)
    arr[0] = inputArray.min()
    arr[1] = inputArray.max()
    return arr
}
