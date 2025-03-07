package problem;

import java.math.BigInteger;
import java.util.stream.LongStream;

import static problem.Solution.problem;

public class Problem56 {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=56
        problem("Powerful digit sum",
                () -> powerfulDigitSum(100));
    }

    static long powerfulDigitSum(int endInclusive) {
        return LongStream.rangeClosed(1, endInclusive)
                .mapToObj(BigInteger::valueOf)
                .flatMapToLong(a -> LongStream.rangeClosed(1, endInclusive)
                        .mapToObj(b -> a.pow((int) b))
                        .map(BigInteger::toString)
                        .mapToLong(s -> s.chars().map(c -> c - '0').sum())
                )
                .max()
                .orElse(0L);
    }

    private Problem56() {}
}
