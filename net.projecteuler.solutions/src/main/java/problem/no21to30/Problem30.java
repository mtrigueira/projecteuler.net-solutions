package problem.no21to30;

import utils.DigitPower;

import java.util.stream.IntStream;

import static problem.Solution.problem;
import static problem.Solution.solution;

public class Problem30 {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=30
        problem("Digit fifth powers");
        solution(sumWhereDigitPowersSumEqualsNumberFor(5));
    }

    static long sumWhereDigitPowersSumEqualsNumberFor(int exponent) {
        DigitPower digitPower = DigitPower.forExponent(exponent);
        return IntStream.rangeClosed(2, (int) digitPower.getMaxPossibleSum())
                .filter(i -> i == digitPower.sumOfDigitPowersFor(i))
                .sum();
    }
}

