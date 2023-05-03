package domains.algorithms

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class BirthdayCakeCandlesKtTest {

    @Test
    fun birthdayCakeCandles() {
        assertEquals(2, domains.algorithms.birthdayCakeCandles(arrayOf(4, 4, 1, 3)))
        assertEquals(1, domains.algorithms.birthdayCakeCandles(arrayOf(4, 4, 5, 1, 3)))
        assertEquals(1, domains.algorithms.birthdayCakeCandles(arrayOf(4, 3)))
    }
}