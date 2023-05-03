package domains.algorithms

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class VeryBigSumKtTest {

    @Test
    fun aVeryBigSum() {
        assertEquals(5000000015, domains.algorithms.aVeryBigSum(arrayOf(1000000001,1000000002,1000000003,1000000004,1000000005)))
    }
}