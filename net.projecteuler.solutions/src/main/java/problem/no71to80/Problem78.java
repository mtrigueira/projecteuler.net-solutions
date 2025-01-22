package problem.no71to80;

import java.math.BigInteger;

import static problem.Solution.problem;
import static utils.sequence.arithmetic.A046641.a;

public class Problem78 {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=78
        problem("Coin partitions", Problem78::leastValueOfCoinsWhereCombinationsDivisibleBy1_000_000);
    }

    private static final int ONE_MILLION = 1_000_000;

    static int leastValueOfCoinsWhereCombinationsDivisibleBy1_000_000() {
        return a(BigInteger.valueOf(ONE_MILLION));
    }

    private Problem78() {}
}
