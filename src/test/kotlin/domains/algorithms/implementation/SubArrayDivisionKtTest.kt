package domains.algorithms.implementation

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SubArrayDivisionKtTest {

    @Test
    fun birthday() {
        assertEquals(2, domains.algorithms.implementation.birthday(arrayOf(2,2,1,3,2), 4, 2))
        assertEquals(0, domains.algorithms.implementation.birthday(arrayOf(1,1,1,1,1,1), 3, 2))
    }
}