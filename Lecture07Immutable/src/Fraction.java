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

    public Fraction(int numerator, int denominator) {
        //normalize it here
        int n_numer = numerator;
        int n_denum = denominator;
        this.numerator = n_numer; //2 --> 1
        this.denominator = n_denum; //4 --> 2
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // 1/3 ?? 2/15
//    public int compareTo(Fraction other) {
//        double myFrac = (double) this.numerator / this.denominator;
//        double otherFrac = (double) other.numerator / this.denominator;
//        return (int) Math.ceil(myFrac - otherFrac);
//    }

    @Override
    public int compareTo(Fraction other) {
        return numerator * other.denominator - other.numerator * this.denominator;
    }

    @Override
    public boolean equals(Object o) {
        if(o != null && this.getClass() == o.getClass()) {
            Fraction other = (Fraction) o;
            return this.denominator == other.denominator &&
                    this.numerator == other.numerator;
        }
        return false;
    }

    public Fraction add(Fraction other) {
        int n = this.numerator * other.denominator + this.denominator * other.numerator;
        int d = this.denominator * other.denominator;
        return new Fraction(n, d);
    }

    public Fraction subtract(Fraction other) {
        int n = this.numerator * other.denominator - this.denominator * other.numerator;
        int d = this.denominator * other.denominator;
        return new Fraction(n, d);
    }

    public Fraction multiply(Fraction other) {
        int n = numerator * other.numerator;
        int d = denominator * other.denominator;
        return new Fraction(n, d); //need to normalize
    }

    public Fraction divide(Fraction other) {
        int n = numerator * other.denominator;
        int d = denominator * other.numerator;
        //need to normalize
        return new Fraction(n, d);
    }

    public String toString() {
        if (denominator == 1) {
            return String.valueOf(numerator);
        } else {
            return numerator + "/" + denominator;
        }
    }
}
