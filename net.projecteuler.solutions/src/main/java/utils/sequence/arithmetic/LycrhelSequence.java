package utils.sequence.arithmetic;

import utils.Palindrome;

import java.math.BigInteger;
import java.util.NoSuchElementException;

public class LycrhelSequence extends ArithmeticSequence<BigInteger> {
    private int i = 0;
    private BigInteger current;

    public LycrhelSequence(int seed) {
        this.current = nextLycrhel(BigInteger.valueOf(seed));
    }

    @Override
    public BigInteger next() {
        if (!hasNext())
            throw new NoSuchElementException("No next element in Lycrhel Sequence");
        BigInteger temp = current;
        current = nextLycrhel(current);
        i++;
        if (i == 51)
            System.err.println("Reached over 50 iterations in Lycrhel Sequence without terminating");

        return temp;
    }

    private BigInteger nextLycrhel(BigInteger i) {
        return i.add(new BigInteger(new StringBuilder(i.toString()).reverse().toString()));
    }

    @Override
    public boolean hasNext() {
        return !Palindrome.isPalindrome(current);
    }
}
