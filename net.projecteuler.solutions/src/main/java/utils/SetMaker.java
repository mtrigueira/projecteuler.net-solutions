package utils;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMaker {
    public static Set<BigInteger> set(int... values) {
        return Arrays.stream(values).asLongStream().mapToObj(BigInteger::valueOf).collect(HashSet::new, HashSet::add, HashSet::addAll);
    }
}
