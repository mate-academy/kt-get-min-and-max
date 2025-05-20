package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    val numbers: IntArray = IntArray(2)
    if (inputArray.isEmpty()) return IntArray(0)
    numbers[0] = inputArray.minOrNull()!!
    numbers[1] = inputArray.maxOrNull()!!
    return numbers
}
