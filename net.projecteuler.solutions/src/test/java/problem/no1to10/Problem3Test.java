package problem.no1to10;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import utils.prime.Prime;
import utils.property.Factors;

import java.math.BigInteger;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem3Test {
    @ParameterizedTest
    @CsvSource({
            "2, 2",
            "3, 3",
            "4, 2",
            "5, 5",
            "6, 3",
            "7, 7",
            "8, 2",
            "9, 3",
            "10, 5",
            "11, 11",
            "12, 3",
            "13, 13",
            "14, 7",
            "15, 5",
            "16, 2",
            "17, 17",
            "18, 3",
            "19, 19",
            "20, 5",
            "29, 29",
            "13195, 29"
    })
    void testLargestPrimeFactor(int i, int expected) {
        assertEquals(optionalPrime(expected), Factors.of(i).stream()
                .map(Prime::of)
                .flatMap(Optional::stream)
                .max(BigInteger::compareTo));
    }

    private static Optional<Prime> optionalPrime(int expected) {
        return Prime.of(BigInteger.valueOf(expected));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 1})
    void testNoLargestPrimeFactor(int i) {
        assertEquals(Optional.empty(), Factors.of(i).stream()
                .map(Prime::of)
                .flatMap(Optional::stream)
                .max(BigInteger::compareTo));
    }
}