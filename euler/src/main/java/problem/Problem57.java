package problem;

import utils.SimpleFraction;

import static problem.Solution.problem;
import static utils.SimpleFraction.*;

public class Problem57 {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=57
        problem("Square root convergents",
                () -> countFractions(1000));
    }

    static int countFractions(int until) {
        int count = 0;
        SimpleFraction f = ZERO;

        for (int i = 1; i <= until; i++) {
            f = ONE.divide(TWO.add(f));
            SimpleFraction rootTwoEstimate = ONE.add(f);
            if (rootTwoEstimate.numerator().toString().length() > rootTwoEstimate.denominator().toString().length())
                count++;
        }

        return count;
    }

    private Problem57() {}
}
