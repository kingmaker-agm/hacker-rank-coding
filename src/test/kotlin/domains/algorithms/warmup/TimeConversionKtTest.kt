package domains.algorithms.warmup

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TimeConversionKtTest {

    @Test
    fun timeConversion() {
        assertEquals("19:05:45", timeConversion("07:05:45PM"))
        assertEquals("06:40:32", timeConversion("06:40:32AM"))
        assertEquals("00:00:00", timeConversion("12:00:00AM"))
        assertEquals("12:00:00", timeConversion("12:00:00PM"))
    }
}