package utils;

public class NaturalNumber {
    public static NaturalNumber of(int value) {
        return new NaturalNumber(value);
    }

    private final int value;

    private NaturalNumber(int value) {
        if (value <= 0) throw new IllegalArgumentException("Natural number must be positive");
        this.value = value;
    }

    public int sumOfMultiplesOf(int n) {
        int numberOfMultiples = (value - 1) / n;

        return sumTo(numberOfMultiples) * n;
    }

    static int sumTo(int n) {
        // Gauss sum of pairs trick
        return n * (n + 1) / 2;
    }
}
