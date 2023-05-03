package domains.algorithms.implementation

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class BetweenTwoSetsKtTest {

    @Test
    fun getTotalX() {
        assertEquals(2, domains.algorithms.implementation.getTotalX(arrayOf(2,6), arrayOf(24,36)))
        assertEquals(3, domains.algorithms.implementation.getTotalX(arrayOf(2,4), arrayOf(16,32, 96)))
    }
}