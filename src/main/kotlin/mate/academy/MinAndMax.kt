package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
        var min = inputArray[0]
        var max = inputArray[0]

        inputArray.forEach {element ->
                if (element < min) {
                        min = element
                }
                if (element > max) {
                        max = element
                }
        }
        return intArrayOf(min,max)
}
