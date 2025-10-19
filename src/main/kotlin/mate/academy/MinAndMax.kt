package mate.academy

//У вас є масив цілих чисел. Поверніть новий масив лише з двома елементами заданого масиву: перший з мінімальним значенням, а другий з максимальним.

fun getMinAndMax(inputArray: IntArray): IntArray {
    if (inputArray.isEmpty()) {
        return IntArray(0)
    }
   val minValue = inputArray.minOrNull()
    val maxValue = inputArray.maxOrNull()


    return intArrayOf(minValue!!, maxValue!!)
}
