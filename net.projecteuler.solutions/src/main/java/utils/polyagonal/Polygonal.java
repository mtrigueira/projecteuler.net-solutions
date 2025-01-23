package utils.polyagonal;

import java.math.BigInteger;
import java.util.List;

public class Polygonal {
    public static final Polygonal TRIANGULAR = new Polygonal(3, "Triangular");
    public static final Polygonal SQUARE = new Polygonal(4, "Square");
    public static final Polygonal PENTAGONAL = new Polygonal(5, "Pentagonal");
    public static final Polygonal HEXAGONAL = new Polygonal(6, "Hexagonal");
    public static final Polygonal HEPTAGONAL = new Polygonal(7, "Heptagonal");
    public static final Polygonal OCTAGONAL = new Polygonal(8, "Octagonal");
    public static final List<Polygonal> POLYGONALS = List.of(TRIANGULAR, SQUARE, PENTAGONAL, HEXAGONAL, HEPTAGONAL, OCTAGONAL);

    private final long sMinus2;
    private final long sMinus4;
    private final long sMinus4Squared;
    private final long twoMultiplySMinus2;
    private final long sMinus2multiply8;
    private final String name;

    public boolean is(BigInteger x) {
        return at(indexOf(x)).equals(x);
    }

    private BigInteger indexOf(BigInteger x) {
        return BigInteger.valueOf(((long) Math.sqrt((x.longValueExact() * sMinus2multiply8 + sMinus4Squared)
        ) + sMinus4) / twoMultiplySMinus2);
    }

    public BigInteger at(BigInteger n) {
        long en = n.longValueExact();
        return BigInteger.valueOf((sMinus2 * en * en - sMinus4 * en) / 2);
    }

    @Override
    public String toString() {
        return name;
    }

    private Polygonal(int sides, String name) {
        this.name = name;
        this.sMinus2 = (sides - 2);
        this.sMinus4 = (sides - 4);
        sMinus4Squared = sMinus4 * (sMinus4);
        twoMultiplySMinus2 = 2 * (sMinus2);
        sMinus2multiply8 = sMinus2 * (8);
    }
}
