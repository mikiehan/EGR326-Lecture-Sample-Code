/**
 * Each Fraction object represents an immutable rational number with a numerator and denominator.
 * Fractions are always stored in reduced form such that the GCD of their
 * numerator and denominator is always 1.
 *
 * @pre to all methods: valid arguments  (I know, I know...)
 */
public final class Fraction implements Comparable<Fraction> {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    //6 --> 6/gcd  = 3
    //4 --> 4/gcd  = 2

    public Fraction(int numerator, int denominator) {
        if(denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator /gcd;
        this.denominator = denominator /gcd;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public int compareTo(Fraction other) {
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    public Fraction add(Fraction other) {
        int n = numerator * other.denominator + other.denominator * denominator;
        int d = denominator * other.denominator;
        return new Fraction(n, d);
    }

    public void subtract(Fraction other) {
    }

    public void multiply(Fraction other) {
        //need to normalize
    }

    public void divide(Fraction other) {
        //need to normalize
    }

    public String toString() {
        if (denominator == 1) {
            return String.valueOf(numerator);
        } else {
            return numerator + "/" + denominator;
        }
    }

    //this method returns greatest common divisor of x and y
    //-6 and 4 is 2
    private static int gcd(int x, int y ){
        if( y == 0 )
            return Math.abs(x);
        else
            return gcd(y, x % y);
    }
}