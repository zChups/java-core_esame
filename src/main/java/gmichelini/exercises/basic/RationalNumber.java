package gmichelini.exercises.basic;

import java.util.Objects;

public class RationalNumber {
    int numerator;
    int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator / greatestCommonDivisor(numerator,denominator);
        this.denominator = denominator / greatestCommonDivisor(numerator, denominator);
    }

    static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

    public int getNumerator() {
        return numerator;
    }


    public int getDenominator() {
        return denominator;
    }


    public RationalNumber add (RationalNumber o){
        int lcm = leastCommonMultiple(this.denominator, o.getDenominator());
        int num = numerator * (lcm/denominator) + o.getNumerator() * (lcm / o.getDenominator());
        return new RationalNumber(num, lcm);
    }
    public RationalNumber multiply(RationalNumber o){
        return new RationalNumber(numerator * o.getNumerator(), denominator * o.getDenominator());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        RationalNumber dst = (RationalNumber) o;
        return numerator == dst.numerator && denominator == dst.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return "Rational{" + "numerator: " + numerator + "denominator: " + denominator + "}";
    }
}
