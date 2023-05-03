package domains.algorithms.warmup

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class VeryBigSumKtTest {

    @Test
    fun aVeryBigSum() {
        assertEquals(5000000015,
            aVeryBigSum(arrayOf(1000000001, 1000000002, 1000000003, 1000000004, 1000000005))
        )
    }
}