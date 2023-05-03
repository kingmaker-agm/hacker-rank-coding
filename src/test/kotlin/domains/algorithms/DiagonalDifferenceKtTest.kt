package domains.algorithms

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class DiagonalDifferenceKtTest {
    @Test
    fun diagonalDifference() {
        val matrix1 = arrayOf(
            arrayOf(1,2,3),
            arrayOf(4,5,6),
            arrayOf(9,8,9)
        )
        assertEquals(2, domains.algorithms.diagonalDifference(matrix1))

        val matrix2 = arrayOf(
            arrayOf(11, 2, 4),
            arrayOf(4, 5, 6),
            arrayOf(10, 8, -12)
        )
        assertEquals(15, domains.algorithms.diagonalDifference(matrix2))
    }
}