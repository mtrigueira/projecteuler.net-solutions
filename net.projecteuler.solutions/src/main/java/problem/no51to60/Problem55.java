package problem.no51to60;

import utils.sequence.arithmetic.LycrhelSequence;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

import static problem.Solution.problem;
import static problem.Solution.solution;

public class Problem55 {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=55
        problem("Lychrel numbers");
        solution(countLychrelNumbers(10_000));
    }

    static long countLychrelNumbers(int endExclusive) {
        return IntStream.range(1, endExclusive)
                .filter(isLycrhelCandidate())
                .count();
    }

    private static IntPredicate isLycrhelCandidate() {
        return i ->  new LycrhelSequence(i).stream()
                .limit(50)
                .count() >= 50;
    }
}
