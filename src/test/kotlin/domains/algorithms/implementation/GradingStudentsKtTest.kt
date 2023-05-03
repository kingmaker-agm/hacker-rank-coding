package domains.algorithms.implementation

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class GradingStudentsKtTest {

    @Test
    fun getFinalGrade() {
        assertEquals(85, domains.algorithms.implementation.getFinalGrade(84))
        assertEquals(29, domains.algorithms.implementation.getFinalGrade(29))
        assertEquals(57, domains.algorithms.implementation.getFinalGrade(57))
    }

    @Test
    fun gradingStudents() {
        assertArrayEquals(arrayOf(75,67,40, 33), domains.algorithms.implementation.gradingStudents(arrayOf(73, 67, 38, 33)))
    }
}