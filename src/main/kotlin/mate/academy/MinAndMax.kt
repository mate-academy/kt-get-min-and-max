package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
  var min = inputArray[0]
  var max = inputArray[0]
  val numbers = IntArray(2)
    for (i in 1 until inputArray.size) {
        if (inputArray[i] > max) {
            max = inputArray[i]
        }
        if (inputArray[i] < min) {
            min = inputArray[i]
        }
    }
    numbers[0] = min
    numbers[1] = max
    return numbers
}
