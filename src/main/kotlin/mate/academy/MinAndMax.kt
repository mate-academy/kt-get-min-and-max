package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val newArray = IntArray(2)
    newArray[0] = inputArray[0]
    newArray[1] = inputArray[0]
    if (inputArray.size > 1) {
        inputArray.forEach { a ->
            if (a < newArray[0]) newArray[0] = a
            if (a  > newArray[1]) newArray[1] = a
        }
    }
    return newArray
}
