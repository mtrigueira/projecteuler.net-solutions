package problem.no41to50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem43Test {
    @Test
    void areAllSubstringsDivisible() {
        assertTrue(Problem43.areAllSubstringsDivisible("1406357289"));
    }

    @Test
    void findDivisiblePanDigitals() {
        assertEquals("22212", Problem43.findDivisiblePanDigitals(4));
    }
}