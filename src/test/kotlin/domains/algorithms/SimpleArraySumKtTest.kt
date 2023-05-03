package domains.algorithms

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SimpleArraySumKtTest {

    @Test
    fun simpleArraySum() {
        assertEquals(6, domains.algorithms.simpleArraySum(arrayOf(1,2,3)))
        assertEquals(0, domains.algorithms.simpleArraySum(arrayOf()))
        assertEquals(-1, domains.algorithms.simpleArraySum(arrayOf(1, -2)))
    }
}