package utils.polyagonal;

import java.math.BigInteger;

import static utils.BigIntegerConstants.*;

public class Polygonal {
    public static final Polygonal TRIANGULAR = new Polygonal(BigInteger.valueOf(3));
    public static final Polygonal SQUARE = new Polygonal(BigInteger.valueOf(4));
    public static final Polygonal PENTAGONAL = new Polygonal(BigInteger.valueOf(5));
    public static final Polygonal HEXAGONAL = new Polygonal(BigInteger.valueOf(6));
    public static final Polygonal HEPTAGONAL = new Polygonal(BigInteger.valueOf(7));
    public static final Polygonal OCTAGONAL = new Polygonal(BigInteger.valueOf(8));

    private final BigInteger sides;
    private final BigInteger sMinus2;
    private final BigInteger sMinus4;

    private Polygonal(BigInteger sides) {
        if(sides==null) throw new IllegalArgumentException("sides cannot be null");
        this.sides = sides;
        this.sMinus2 = this.sides.subtract(TWO);
        this.sMinus4 = this.sides.subtract(FOUR);
    }

    public boolean is(BigInteger x) {
        BigInteger n = indexOf(x);
        BigInteger x2 = at(n);
        return x2.equals(x);
    }

    private BigInteger indexOf(BigInteger x) {
        return ((x.multiply(sMinus2.multiply(EIGHT)).add(sides.subtract(FOUR).pow(2)))
                .sqrt().add(sides.subtract(FOUR))).divide(TWO.multiply(sMinus2));
    }

    public BigInteger at(BigInteger n) {
        BigInteger nSquared = n.pow(2);
        BigInteger a = sMinus2.multiply(nSquared);
        BigInteger b = sMinus4.multiply(n);
        return a.subtract(b).divide(TWO);
    }
}
