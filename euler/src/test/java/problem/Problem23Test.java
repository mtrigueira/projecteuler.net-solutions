package problem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Problem23Test {
    @BeforeAll
    static void init() {
        Problem23.sumOfNonAbundantSums(28124);
    }

    @ParameterizedTest(name = "{0}")
    @ValueSource(ints = {24, 30, 36, 40, 42, 48, 54, 56, 60, 66, 70, 72, 78, 80, 84, 88, 90, 96, 100, 28124})
    void hasAbundantSum(int n) {
        assertTrue(Problem23.hasAbundantSum(n));
    }

    @ParameterizedTest(name = "{0}")
    @ValueSource(ints = {1, 23, 31, 6673})
    void hasNotAbundantSum(int n) {
        assertFalse(Problem23.hasAbundantSum(n));
    }

    @ParameterizedTest(name = "f({0}) = {1}")
    @CsvSource({
            "1,1",
            "2,3",
            "11,66",
            "12,78",
            "100,2766"})
    void sumOfNonAbundantSums(int n, long sum) {
        assertEquals(sum, Problem23.sumOfNonAbundantSums(n));
    }
}