package domains.algorithms.warmup

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PlusMinusKtTest {

    @Test
    fun plusMinus() {
        val (positive1, negative1, zero1) = plusMinus(arrayOf(1, 1, 0, -1, -1))
        assertEquals(0.4f, positive1)
        assertEquals(0.4f, negative1)
        assertEquals(0.2f, zero1)

        val (positive2, negative2, zero2) = plusMinus(arrayOf(-4, 3, -9, 0, 4, 1))
        assertEquals(0.5f, positive2)
        assertEquals(1f/3, negative2)
        assertEquals(1f/6, zero2)
    }
}