package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
    var rezultArray : IntArray = IntArray(2) {inputArray[0]}
    for (i in 1..inputArray.size - 1) {
        if (inputArray[i] < rezultArray[0]) {
            rezultArray[0] = inputArray[i]
        }
        if (inputArray[i] > rezultArray[1]) {
            rezultArray[1] = inputArray[i]
        }
    }
//    rezultArray[0] = inputArray.min()
//    rezultArray[1] = inputArray.max()
    return rezultArray
}
