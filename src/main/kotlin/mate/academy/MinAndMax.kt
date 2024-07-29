package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    require(inputArray.isNotEmpty()) { "Input array cannot be empty" }

    val min = inputArray.minOrNull() ?: error("Unexpected error: minOrNull returned null")
    val max = inputArray.maxOrNull() ?: error("Unexpected error: maxOrNull returned null")

    return intArrayOf(min, max)
}
}
