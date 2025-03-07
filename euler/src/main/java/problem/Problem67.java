package problem;

import utils.FileUtils;
import utils.data.Triangle;

import static problem.Solution.problem;
import static utils.FileUtils.concat;

public class Problem67 {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=67
        problem("Maximum path sum II",
                () -> Triangle.of(TRIANGLE).maxPathSum());
    }

    private static final String TRIANGLE = concat(FileUtils.getString("/0067_triangle.txt"), "0");

    private Problem67() {}
}
