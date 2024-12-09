package problem.no81to90;

import utils.FileUtils;
import utils.data.Grid;
import utils.data.GridNumber;

import static problem.Solution.problem;

public class Problem81 {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=81
        problem("Path sum: Two ways", () ->
                solution(Grid.of(GridNumber.toShortGrid(FileUtils.getString("/0081_matrix.txt").replaceAll(","," ").lines()))));
    }

    static long solution(Grid grid) {
        return grid.findMinPathSum();
    }

    private Problem81() {
    }
}
