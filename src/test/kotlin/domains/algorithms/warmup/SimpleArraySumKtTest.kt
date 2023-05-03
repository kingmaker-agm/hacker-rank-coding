package domains.algorithms.warmup

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SimpleArraySumKtTest {

    @Test
    fun simpleArraySum() {
        assertEquals(6, simpleArraySum(arrayOf(1, 2, 3)))
        assertEquals(0, simpleArraySum(arrayOf()))
        assertEquals(-1, simpleArraySum(arrayOf(1, -2)))
    }
}