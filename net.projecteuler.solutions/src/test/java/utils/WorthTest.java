package utils;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorthTest {
    @ParameterizedTest
    @CsvSource({
            "A,1",
            "Z,26",
            "ANN,29",
            "COLIN,53"
    })
    void wordWorth(String name, int worth) {
        assertEquals(worth, Worth.wordWorth(name));
    }

    @ParameterizedTest
    @CsvSource({
            "A,1",
            "Z,26"
    })
    void charWorth(char c, int score) {
        assertEquals(score, Worth.charWorth(c));
    }
}