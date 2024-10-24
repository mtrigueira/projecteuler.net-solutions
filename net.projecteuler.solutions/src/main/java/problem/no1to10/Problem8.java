package problem.no1to10;

import utils.FileUtils;
import utils.sequence.given.WideNumberProductSequence;

import static problem.Solution.problem;
import static problem.Solution.solution;

public class Problem8 {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=8
        problem("Largest product in a series");
        solution(greatestProductOfAdjacentDigits(13));
    }

    static Long greatestProductOfAdjacentDigits(int numberOfAdjacentDigits) {
        return new WideNumberProductSequence(BIG_NUMBER, numberOfAdjacentDigits).stream()
                .reduce(0L, Long::max);
    }

    public static final String BIG_NUMBER = FileUtils.getStrings("/0008_numbers.txt")
            .reduce("", String::concat);
}
