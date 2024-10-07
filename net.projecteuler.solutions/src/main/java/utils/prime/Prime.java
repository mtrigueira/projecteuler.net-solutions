package utils.prime;

import java.math.BigInteger;

import static java.math.BigInteger.TWO;
import static utils.operator.BigComparisonOperator.lessThan;

public abstract class Prime {
    public static boolean isPrime(long candidate) {
        return isPrime(BigInteger.valueOf(candidate));
    }

    public static boolean isPrime(BigInteger candidate) {
        if (lessThan(candidate, TWO)) return false;

        return CachedPrime.isPrime(candidate);
    }
}