package domains.algorithms.implementation

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import java.io.ByteArrayOutputStream
import java.io.PrintStream

val stdOut: PrintStream = System.out
lateinit var fakeOut: ByteArrayOutputStream
const val bonAppetit = "Bon Appetit"

class BillDivisionKtTest {
    @BeforeEach
    fun replaceStdout() {
        fakeOut = ByteArrayOutputStream()
        System.setOut(PrintStream(fakeOut))
    }

    @AfterEach
    fun restoreStdout() {
        System.setOut(stdOut)
    }

    @Test
    fun bonAppetit1() {
        domains.algorithms.implementation.bonAppetit(arrayOf(2,4,6), 2, 3)
        assertEquals(bonAppetit, fakeOut.toString())
    }

    @Test
    fun bonAppetit2() {
        domains.algorithms.implementation.bonAppetit(arrayOf(2,4,6), 2, 6)
        assertEquals("3", fakeOut.toString())
    }

    @Test
    fun bonAppetit3() {
        domains.algorithms.implementation.bonAppetit(arrayOf(3,10,2,9), 1, 12)
        assertEquals("5", fakeOut.toString())
    }

    @Test
    fun bonAppetit4() {
        domains.algorithms.implementation.bonAppetit(arrayOf(3,10,2,9), 1, 7)
        assertEquals(bonAppetit, fakeOut.toString())
    }
}