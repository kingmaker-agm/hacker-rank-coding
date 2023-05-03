package domains.algorithms.implementation

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MigratoryBirdKtTest {

    @Test
    fun migratoryBirds() {
        assertEquals(1, domains.algorithms.implementation.migratoryBirds(arrayOf(1,1,2,2,3)))
        assertEquals(4, domains.algorithms.implementation.migratoryBirds(arrayOf(1,4,4,4,5,3)))
        assertEquals(3, domains.algorithms.implementation.migratoryBirds(arrayOf(1,2,3,4,5,4,3,2,1,3,4)))
    }
}