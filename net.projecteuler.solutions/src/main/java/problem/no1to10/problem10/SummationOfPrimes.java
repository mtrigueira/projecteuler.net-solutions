package problem.no1to10.problem10;

import utils.sequence.arithmetic.PrimeSequence;
import utils.Timer;

public class SummationOfPrimes {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=10
        Timer timer = Timer.start();
        System.out.println(below(2000000));
        timer.println();
    }

    static long below(int limit) {
        PrimeSequence seq = new PrimeSequence();
        long sum = 0;

        for (long prime = seq.next().longValueExact(); prime<limit; prime = seq.next().longValueExact())
            sum += prime;

        return sum;
    }
}