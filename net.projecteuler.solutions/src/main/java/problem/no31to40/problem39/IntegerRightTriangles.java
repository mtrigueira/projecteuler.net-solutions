package problem.no31to40.problem39;

import utils.PythagoreanTriangle;
import utils.Triplet;

import java.util.HashSet;
import java.util.Set;

public class IntegerRightTriangles {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=39
        System.out.println(maximumRightTriangleSolutionsForPerimiterLessThanOrEqualTo(1000));
    }

    private static int maximumRightTriangleSolutionsForPerimiterLessThanOrEqualTo(int limit) {
        int max = 0;
        int maxP = 0;
        for (int p = 1; p <= limit ; p++) {
            int size = calculateSolutionsFor(p).size();
            if(size > max) {
                max = size;
                maxP = p;
            }
        }
        return maxP;
    }

    static Set<Triplet> calculateSolutionsFor(int perimiter) {
        int limit = perimiter - 1;
        HashSet<Triplet> triplets = new HashSet<>();

        for (int a = 1; a < limit - 2; a++)
            for (int b = a + 1; b < limit - 1; b++) {
                int c = PythagoreanTriangle.calculateC(a, b, perimiter);
                if (PythagoreanTriangle.isPythagoreanTriplet(a, b, c))
                    triplets.add(Triplet.of(a, b, c));
            }

        return triplets;
    }
}
