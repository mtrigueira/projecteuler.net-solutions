package problem.no1to10;

import utils.prime.Prime;
import utils.sequence.arithmetic.PrimeSequence;

import static problem.Solution.problem;
import static problem.Solution.solution;

public class Problem7 {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=7
        problem("10001st prime");
        solution(prime(10001));
    }

    public static Prime prime(int n) {
        return PrimeSequence.fromFirst().stream().limit(n).reduce((a, b) -> b).orElse(null);
    }
}
