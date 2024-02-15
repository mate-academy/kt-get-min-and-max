package mate.academy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MinAndMaxTest {

    @Test
    fun getMinAndMax_NonEmptyArray_ReturnsMinMax() {
        // given
        val inputArray = intArrayOf(5, 2, 8, 3, 9, 1)

        // when
        val result = getMinAndMax(inputArray)

        // then
        assertArrayEquals(intArrayOf(1, 9), result)
    }

    @Test
    fun getMinAndMax_ArrayWithNegativeValues_ReturnsMinMax() {
        // given
        val inputArray = intArrayOf(-10, -2, -8, -3, -9, -1)

        // when
        val result = getMinAndMax(inputArray)

        // then
        assertArrayEquals(intArrayOf(-10, -1), result)
    }

    @Test
    fun getMinAndMax_ArrayWithSingleElement_ReturnsDuplicateElement() {
        // given
        val inputArray = intArrayOf(7)

        // when
        val result = getMinAndMax(inputArray)

        // then
        assertArrayEquals(intArrayOf(7, 7), result)
    }

    @Test
    fun getMinAndMax_ArrayWithAllIdenticalElements_ReturnsDuplicateElement() {
        // given
        val inputArray = intArrayOf(4, 4, 4, 4, 4)

        // when
        val result = getMinAndMax(inputArray)

        // then
        assertArrayEquals(intArrayOf(4, 4), result)
    }
}
