package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var minNumber = inputArray[0];
    var maxNumber = inputArray[0];

    for (number in inputArray) {
        if (number > maxNumber) {
            maxNumber = number;
        }
        if (number < minNumber) {
            minNumber = number;
        }
    }

    return intArrayOf(minNumber, maxNumber)
}
