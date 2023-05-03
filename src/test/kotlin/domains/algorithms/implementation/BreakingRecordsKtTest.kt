package domains.algorithms.implementation

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class BreakingRecordsKtTest {

    @Test
    fun breakingRecords() {
        val (max1, min1) = domains.algorithms.implementation.breakingRecords(arrayOf(12,24,10,24))
        assertEquals(1, max1)
        assertEquals(1, min1)

        val (max2, min2) = domains.algorithms.implementation.breakingRecords(arrayOf(10,5,20,20,4,5,2,25,1))
        assertEquals(2, max2)
        assertEquals(4, min2)

        val (max3, min3) = domains.algorithms.implementation.breakingRecords(arrayOf(3,4,21,36,10,28,35,5,24,42))
        assertEquals(4, max3)
        assertEquals(0, min3    )
    }
}