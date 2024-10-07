package problem.no1to10.problem7;

import utils.sequence.Sequence;
import utils.sequence.arithmetic.PrimeSequence;

public class NthPrime {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=7
        System.out.println(prime(10001));
    }

    public static long prime(int n) {
        Sequence seq = new PrimeSequence();

        for (int i = 1; i < n; i++)
            seq.next();

        return seq.next().longValueExact();
    }
}