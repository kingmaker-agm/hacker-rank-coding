package domains.algorithms.warmup

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class BirthdayCakeCandlesKtTest {

    @Test
    fun birthdayCakeCandles() {
        assertEquals(2, birthdayCakeCandles(arrayOf(4, 4, 1, 3)))
        assertEquals(1, birthdayCakeCandles(arrayOf(4, 4, 5, 1, 3)))
        assertEquals(1, birthdayCakeCandles(arrayOf(4, 3)))
    }
}