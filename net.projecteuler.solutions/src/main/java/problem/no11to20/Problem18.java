package problem.no11to20;

import utils.FileUtils;
import utils.data.Triangle;

import static problem.Solution.problem;
import static problem.Solution.solution;

public class Problem18 {

    public static final String TRIANGLE = FileUtils.getString("/0018_triangle.txt");

    public static void main(String[] args) {
        // https://projecteuler.net/problem=18
        problem("Maximum path sum I");
        solution(maxPathSum(TRIANGLE));
    }

    static int maxPathSum(String string) {
        return Triangle.of(string).maxPathSum();
    }
}
