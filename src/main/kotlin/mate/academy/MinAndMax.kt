package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val array: IntArray = IntArray(2)
    array.set(0, inputArray.get(0))
    array.set(1, inputArray.get(inputArray.size - 1))
    inputArray.forEach { e ->
        if (e < array.get(0)) {
            array.set(0, e)
        } else if (e > array.get(1)) {
            array.set(1, e)
        }
    }

    return array
}
