package domains.algorithms.implementation;

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test;

class DrawingBookTest {

    @Test
    fun pageCount() {
        assertEquals(0, DrawingBook.pageCount(5, 1))
        assertEquals(1, DrawingBook.pageCount(5, 2))
        assertEquals(1, DrawingBook.pageCount(5, 3))
        assertEquals(1, DrawingBook.pageCount(6, 2))
        assertEquals(1, DrawingBook.pageCount(6, 5))
        assertEquals(0, DrawingBook.pageCount(6, 6))
        assertEquals(0, DrawingBook.pageCount(5, 4))
    }

    @Test
    fun turnsFromBeginning() {
        assertEquals(0, DrawingBook.turnsFromBeginning(1))
        assertEquals(1, DrawingBook.turnsFromBeginning(2))
        assertEquals(1, DrawingBook.turnsFromBeginning(3))
        assertEquals(2, DrawingBook.turnsFromBeginning(4))
        assertEquals(2, DrawingBook.turnsFromBeginning(5))
        assertEquals(5, DrawingBook.turnsFromBeginning(11))
    }

    @Test
    fun turnsFromLast() {
        val onePageLastPageNumber = 44
        assertEquals(0, DrawingBook.turnsFromLast(44, onePageLastPageNumber))
        assertEquals(1, DrawingBook.turnsFromLast(43, onePageLastPageNumber))
        assertEquals(1, DrawingBook.turnsFromLast(42, onePageLastPageNumber))
        assertEquals(2, DrawingBook.turnsFromLast(41, onePageLastPageNumber))
        assertEquals(2, DrawingBook.turnsFromLast(40, onePageLastPageNumber))
        assertEquals(5, DrawingBook.turnsFromLast(34, onePageLastPageNumber))

        val twoPageLastPageNumber = 45
        assertEquals(0, DrawingBook.turnsFromLast(45, twoPageLastPageNumber))
        assertEquals(0, DrawingBook.turnsFromLast(44, twoPageLastPageNumber))
        assertEquals(1, DrawingBook.turnsFromLast(43, twoPageLastPageNumber))
        assertEquals(1, DrawingBook.turnsFromLast(42, twoPageLastPageNumber))
        assertEquals(2, DrawingBook.turnsFromLast(41, twoPageLastPageNumber))
        assertEquals(2, DrawingBook.turnsFromLast(40, twoPageLastPageNumber))
        assertEquals(5, DrawingBook.turnsFromLast(34, twoPageLastPageNumber))
    }
}