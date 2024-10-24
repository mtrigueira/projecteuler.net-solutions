package problem.no11to20;

import utils.data.DigitNumber;

import static java.math.BigInteger.TWO;
import static problem.Solution.problem;
import static problem.Solution.solution;

public class Problem16 {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=16
        problem("Power digit sum");
        solution(of2ToThe(1000));
    }

    public static int of2ToThe(int i) {
        return DigitNumber.of(TWO.pow(i)).sumOfDigits();
    }
}
