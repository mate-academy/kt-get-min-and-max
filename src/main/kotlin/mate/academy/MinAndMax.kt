package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var a = inputArray[0]
    var b = inputArray[0]
    var arrayMinMax = IntArray(2)

    for (i in 1 until inputArray.size) {
        if (inputArray[i] < a) {
            a = inputArray[i]
        }
        if ((inputArray[i] > b)) {
            b = inputArray[i]
        }
    }
    arrayMinMax.set(0, a)
    arrayMinMax.set(1, b)
    return arrayMinMax
}
