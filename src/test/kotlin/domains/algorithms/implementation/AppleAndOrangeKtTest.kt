package domains.algorithms.implementation

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import java.io.ByteArrayOutputStream
import java.io.OutputStream
import java.io.PrintStream

val originalOut: PrintStream = System.out
lateinit var out: OutputStream

class AppleAndOrangeKtTest {

    @BeforeEach
    fun replaceStdOut() {
        out = ByteArrayOutputStream()
        System.setOut(PrintStream(out))
    }

    @AfterEach
    fun restoreStdOut() {
        System.setOut(originalOut)
    }

    @Test
    fun countApplesAndOranges() {
        domains.algorithms.implementation.countApplesAndOranges(7, 11, 5, 15, arrayOf(-2,2,1), arrayOf(5,-6))
        assertEquals("1\r\n1\r\n", out.toString())
    }
}