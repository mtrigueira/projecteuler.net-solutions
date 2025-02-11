package utils;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Maker {
    public static Set<Long> setL(int... values) {
        return Arrays.stream(values).asLongStream().collect(HashSet::new, HashSet::add, HashSet::addAll);
    }

    public static Set<BigInteger> set(int... values) {
        return Arrays.stream(values).asLongStream().mapToObj(BigInteger::valueOf).collect(HashSet::new, HashSet::add, HashSet::addAll);
    }

    public static List<BigInteger> list(int... values) {
        return Arrays.stream(values).asLongStream().mapToObj(BigInteger::valueOf).toList();
    }

    private Maker() {
    }
}
