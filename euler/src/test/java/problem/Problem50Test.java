package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem50Test {
    @Test
    void test100() {
        assertEquals(41, Problem50.largestConsecutivePrimeSumBelow(100).orElseThrow());
    }

    @Test
    void test1000() {
        assertEquals(953, Problem50.largestConsecutivePrimeSumBelow(1000).orElseThrow());
    }
}