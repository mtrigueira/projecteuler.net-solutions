package problem.no1to10;

import utils.operator.Factorial;

import java.util.stream.LongStream;

import static problem.Solution.problem;
import static problem.Solution.solution;

public class Problem5 {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=5
        problem("Smallest multiple");
        solution(of(20));
    }

    public static long of(int n) {
        return LongStream.rangeClosed(1, Factorial.of(n))
                .filter(candidate -> isDivisibleByNaturalNumbersTo(candidate, n))
                .findFirst().orElse(-1L);
    }

    static boolean isDivisibleByNaturalNumbersTo(long multiple, long n) {
        return LongStream.rangeClosed(1, n)
                .allMatch(i -> isAFactor(multiple, i));
    }

    private static boolean isAFactor(long i, long candidate) {
        return i % candidate == 0;
    }
}
