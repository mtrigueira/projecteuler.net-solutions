package problem.no11to20;

import utils.FileUtils;
import utils.data.Triangle;

import static problem.Solution.problem;
import static utils.FileUtils.concat;

public class Problem18 {
     private Problem18() {}

    private static final String TRIANGLE = concat(FileUtils.getString("/0018_triangle.txt"),"1");

    public static void main(String[] args) {
        // https://projecteuler.net/problem=18
        problem("Maximum path sum I",
        () -> Triangle.of(TRIANGLE).maxPathSum());
    }
}
