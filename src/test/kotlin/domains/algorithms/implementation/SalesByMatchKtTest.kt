package domains.algorithms.implementation

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SalesByMatchKtTest {
    @Test
    fun sockMerchant() {
        assertEquals(2, domains.algorithms.implementation.sockMerchant(7, arrayOf(1,2,1,2,1,3,2)))
        assertEquals(3, domains.algorithms.implementation.sockMerchant(9, arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)))
    }
}