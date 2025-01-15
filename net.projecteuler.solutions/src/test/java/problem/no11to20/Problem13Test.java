package problem.no11to20;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem13Test {
    @ParameterizedTest(name = "{0} = {1}")
    @CsvSource({
            "0,0+0",
            "1,1+0",
            "12,0+1+11",
            "12345678901234567890123456789012345678901234567890,12345678901234567890123456789012345678901234567890",
            "12345678901234567890123456789012345678901234567891,12345678901234567890123456789012345678901234567890+1",
            "999999999999999999999999999999999999999999999999999,12345678901234567890123456789012345678901234567890+987654321098765432109876543210987654321098765432109",
            "1000000000000000000000000000000000000000000000000000,12345678901234567890123456789012345678901234567890+987654321098765432109876543210987654321098765432109+1"
    })
    void sum(String expected, String input) {
        String numbers = input.replace('+','\n');

        assertEquals(expected, Problem13.sum(numbers.lines()));
    }
}