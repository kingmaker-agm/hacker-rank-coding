package domains.algorithms.warmup

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import java.io.ByteArrayOutputStream
import java.io.OutputStream
import java.io.PrintStream

val originalOut = System.out
lateinit var out: OutputStream

class MinMaxSumKtTest {

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
    fun miniMaxSum1() {
        miniMaxSum(arrayOf(1,2,3,4,5))
        assertEquals("10 14", out.toString())
    }

    @Test
    fun miniMaxSum2() {
        miniMaxSum(arrayOf(793810624, 895642170, 685903712, 623789054, 468592370))
        assertEquals("2572095760 2999145560", out.toString())
    }
}