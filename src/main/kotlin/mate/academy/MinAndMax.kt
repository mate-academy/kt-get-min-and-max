package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val erer = IntArray(2)
    var less: Int = inputArray[0]
    var top: Int = inputArray[0]
    for (i in inputArray.indices - 1) {
        if (less > inputArray[i]) {
            less = inputArray[i]
        }
        if (top < inputArray[i]) {
            top = inputArray[i]
        }
    }
    erer[0] = less
    erer[1] = top
    return erer
}
