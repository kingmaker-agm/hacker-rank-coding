package domains.algorithms.warmup

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CompareTheTripletsKtTest {
    @Test
    fun compareTriplets() {
        val (aliceScore1, bobScore1) = compareTriplets(arrayOf(5, 6, 7), arrayOf(3, 6, 10))
        assertEquals(aliceScore1, 1)
        assertEquals(bobScore1, 1)

        val (aliceScore2, bobScore2) = compareTriplets(
            arrayOf(17, 28, 30),
            arrayOf(99, 16, 8)
        )
        assertEquals(aliceScore2, 2)
        assertEquals(bobScore2, 1)
    }
}