package domains.algorithms.implementation

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class DayOfTheProgrammerKtTest {

    @Test
    fun dayOfProgrammer() {
        assertEquals("12.09.2016", domains.algorithms.implementation.dayOfProgrammer(2016))
        assertEquals("13.09.2017", domains.algorithms.implementation.dayOfProgrammer(2017))
        assertEquals("12.09.1984", domains.algorithms.implementation.dayOfProgrammer(1984))
        assertEquals("12.09.1800", domains.algorithms.implementation.dayOfProgrammer(1800))
        assertEquals("26.09.1918", domains.algorithms.implementation.dayOfProgrammer(1918))
        assertEquals("12.09.2000", domains.algorithms.implementation.dayOfProgrammer(2000))
    }
}