package domains.algorithms.implementation

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class DivisibleSumPairsKtTest {

    @Test
    fun divisibleSumPairs() {
        assertEquals(3, domains.algorithms.implementation.divisibleSumPairs(6, 5, arrayOf(1,2,3,4,5,6)))
        assertEquals(5, domains.algorithms.implementation.divisibleSumPairs(6, 3, arrayOf(1, 3, 2, 6, 1, 2)))
    }
}