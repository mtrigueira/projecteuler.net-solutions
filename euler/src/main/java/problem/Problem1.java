package problem;

import utils.NaturalNumber;

import static problem.Solution.problem;

public class Problem1 {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=1
        problem("Multiples of 3 or 5",
                () -> naturalNumberSumOfMultiplesOf3or5(1000));
    }

    static int naturalNumberSumOfMultiplesOf3or5(int i) {
        var n = NaturalNumber.of(i);
        int doubleCounts = n.sumOfMultiplesOf(15);

        return n.sumOfMultiplesOf(3)
                + n.sumOfMultiplesOf(5)
                - doubleCounts;
    }

    private Problem1() {}
}

