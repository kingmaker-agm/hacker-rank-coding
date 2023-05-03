package domains.algorithms.implementation

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class NumberLineJumpsKtTest {

    @Test
    fun kangaroo() {
        assertEquals("YES", domains.algorithms.implementation.kangaroo(2,1,1,2))
        assertEquals("NO", domains.algorithms.implementation.kangaroo(2,2,1,2))
        assertEquals("YES", domains.algorithms.implementation.kangaroo(4,1,0,3))
        assertEquals("NO", domains.algorithms.implementation.kangaroo(4,1,0,1))
        assertEquals("YES", domains.algorithms.implementation.kangaroo(4,1,4,3))
    }
}