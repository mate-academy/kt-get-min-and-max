package mate.academy

fun getMinAndMax(inputArray: IntArray) 
    = inputArray.takeIf { it.isNotEmpty() }
    ?.let { intArrayOf(it.minOrNull() ?: 0, it.maxOrNull() ?: 0) }
    ?: intArrayOf()
