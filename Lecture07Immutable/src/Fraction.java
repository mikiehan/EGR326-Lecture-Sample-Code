/**
 * Each Fraction object represents an immutable rational number with a numerator and denominator.
 * Fractions are always stored in reduced form such that the GCD of their
 * numerator and denominator is always 1.
 *
 * @pre to all methods: valid arguments  (I know, I know...)
 */
public class Fraction implements Comparable<Fraction> {
    private int numerator;
    private int denominator;

    public Fraction(int numerator) {
    }

    public Fraction(int numerator, int denominator) {
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

    public void add(Fraction other) {
    }

    public void subtract(Fraction other) {
    }

    public void multiply(Fraction other) {
        numerator *= other.numerator;
        denominator *= other.denominator;
        //need to normalize
    }

    public void divide(Fraction other) {
        numerator *= other.denominator;
        denominator *= other.numerator;
        //need to normalize
    }

    public String toString() {
        if (denominator == 1) {
            return String.valueOf(numerator);
        } else {
            return numerator + "/" + denominator;
        }
    }
}
