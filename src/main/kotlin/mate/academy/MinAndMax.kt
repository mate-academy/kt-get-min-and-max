package mate.academy

fun getMinAndMax(inputArray: IntArray): IntArray {
   var min: Int = inputArray[0]
   var max: Int = inputArray[0]
   val result: IntArray = IntArray (2) {0}
   for (i in 1 until inputArray.size) {
      if (min > inputArray[i]) {
         min = inputArray[i]
      }
      if (max < inputArray[i]) {
         max = inputArray[i]
      }
   }
   result[0] = min
   result[1] = max
   return  result
}
