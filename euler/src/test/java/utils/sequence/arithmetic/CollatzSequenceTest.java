package utils.sequence.arithmetic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CollatzSequenceTest {
    static final CollatzSequence collatzSequence = CollatzSequence.of(13);

    @ParameterizedTest
    @ValueSource(ints = {13,40,20,10,5,16,8,4,2})
    void shouldReturnCorrectCollatzSequence(int number) {
        assertEquals(number, collatzSequence.next());
    }

    static AtomicInteger valueIndexIsChainLength = new AtomicInteger(1);
    @ParameterizedTest
    @ValueSource(ints = {2,4,8,16,5,10,20,40,13})
    void chainLength(int n) {
        assertEquals(valueIndexIsChainLength.getAndIncrement(), CollatzSequence.of(n).count());
    }

    @Test
    void overFlow() {
        CollatzSequence s = CollatzSequence.of(Long.MAX_VALUE/3+1);
        assertThrows(NoSuchElementException.class, s::next);
    }
}