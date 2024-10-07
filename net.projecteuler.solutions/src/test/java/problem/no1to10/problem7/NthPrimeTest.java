package problem.no1to10.problem7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NthPrimeTest {
    @ParameterizedTest
    @CsvSource({
            "1, 2",
            "2, 3",
            "3, 5",
            "4, 7",
            "5, 11",
            "6, 13",
            "7, 17",
            "8, 19",
            "9, 23",
            "10, 29",
            "11, 31",
            "12, 37",
            "13, 41",
            "14, 43",
            "15, 47",
            "16, 53",
            "17, 59",
            "18, 61",
            "19, 67",
            "20, 71",
            "21, 73",
            "22, 79",
            "23, 83",
            "24, 89"})
    void test(int n, int prime) {
        assertEquals(prime, NthPrime.prime(n));
    }
}