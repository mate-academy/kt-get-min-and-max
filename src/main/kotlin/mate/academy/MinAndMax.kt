package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {

    var min: Int = inputArray[0]
    var max = inputArray[1]
    for (i in 0 until inputArray.size) {
        if (inputArray[i] < min) {
            min = inputArray[i]
        }
        if (inputArray[i] > max) {
            max = inputArray[i]
        }

        }

    val result: IntArray = IntArray(2)
    result.set(0,min)
    result.set(1,max)


    return result
}
