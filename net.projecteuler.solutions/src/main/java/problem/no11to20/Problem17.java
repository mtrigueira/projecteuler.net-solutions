package problem.no11to20;

import utils.data.NumberWord;

import java.util.regex.Pattern;
import java.util.stream.IntStream;

import static problem.Solution.problem;
import static problem.Solution.solution;

public class Problem17 {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=17
        problem("Number letter counts");
        solution(forNumbersTo(1000));
    }

    private static final Pattern NOT_ALPHABETIC = Pattern.compile("[^a-z]");
    static int forNumbersTo(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(NumberWord::of)
                .map(Problem17::removeAllNonLetters)
                .map(String::length)
                .reduce(0, Integer::sum);
    }

    private static String removeAllNonLetters(String number) {
        return NOT_ALPHABETIC.matcher(number).replaceAll("");
    }
}
