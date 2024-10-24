package utils;

import java.math.BigInteger;

public class SimpleFraction extends Fraction {
    public static final SimpleFraction ZERO = SimpleFraction.factory(BigInteger.ZERO, BigInteger.ONE);
    public static final SimpleFraction ONE = SimpleFraction.factory( BigInteger.ONE, BigInteger.ONE);
    public static final SimpleFraction TWO = SimpleFraction.factory(BigInteger.TWO, BigInteger.ONE);

    public static SimpleFraction of(BigInteger numerator, BigInteger denominator) {
        return factory(numerator, denominator).simplify();
    }

    private static SimpleFraction factory(BigInteger numerator, BigInteger denominator) {
        return new SimpleFraction(numerator, denominator);
    }
    private SimpleFraction(BigInteger numerator, BigInteger denominator) {
        super(numerator, denominator, numerator + "/" + denominator);
    }

    public static SimpleFraction of(int nRight, int dRight) {
        return of(BigInteger.valueOf(nRight), BigInteger.valueOf(dRight));
    }

    private SimpleFraction simplify() {
        if (n.equals(d)) return ONE;
        BigInteger gcd = gcd(n, d);
        if (BigInteger.ONE.equals(gcd)) return this;
        return SimpleFraction.of(n.divide(gcd), d.divide(gcd));
    }

    private static BigInteger gcd(BigInteger a, BigInteger b) {
        return BigInteger.ZERO.equals(b) ? a : gcd(b, a.mod(b));
    }

    public SimpleFraction multiply(SimpleFraction by) {
        BigInteger newN = this.n.multiply(by.n);
        BigInteger newD = this.d.multiply(by.d);
        return SimpleFraction.of(newN, newD);
    }

    public SimpleFraction add(SimpleFraction that) {
        BigInteger cm = this.denominator() .multiply( that.denominator());

        BigInteger newNumerator = (this.numerator().multiply(cm).divide(this.denominator())
                .add(that.numerator().multiply(cm).divide(that.denominator())));

        return SimpleFraction.of(newNumerator, cm);
    }

    public SimpleFraction divide(SimpleFraction that) {
        return SimpleFraction.of( this.numerator().multiply(that.denominator()),
                this.denominator().multiply(that.numerator()));
    }
}
