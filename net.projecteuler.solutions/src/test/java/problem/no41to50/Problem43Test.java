package problem.no41to50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem43Test {
    @Test
    void findNoDivisiblePanDigitals() {
        assertEquals("No divisible pandigital found", Problem43.findDivisiblePanDigitals(0));
    }

    @Test
    void findDivisiblePanDigital() {
        assertEquals("4106357289", Problem43.findDivisiblePanDigitals(1));
    }
}