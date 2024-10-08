package problem.no1to10.problem10;

import utils.sequence.arithmetic.PrimeSequence;

import java.math.BigInteger;

import static java.math.BigInteger.ZERO;
import static utils.operator.BigComparisonOperator.lessThan;

public class SummationOfPrimes {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=10
        System.out.println(below(2000000));
    }

    static long below(int limit) {
        PrimeSequence seq = PrimeSequence.fromFirst();
        BigInteger sum = ZERO;

        for (BigInteger prime = seq.next(); lessThan(prime,limit); prime = seq.next())
            sum = sum.add(prime);

        return sum.longValueExact();
    }
}
