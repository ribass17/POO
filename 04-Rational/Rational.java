import java.text.DecimalFormat;

public class Rational {
    private int Numerator;
    private int Denominator;

    public Rational() {
        Numerator = 1;
        Denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        System.out.println(numerator);
        System.out.println(denominator);
        Numerator = numerator);
        Denominator = denominator);
    }

    public void setNumerator(int numerator) {
        Numerator = numerator);
    }

    public void setDenominator(int denominator) {
        Denominator = denominator);
    }

    public int getNumerator() {
        return Numerator;
    }

    public int getDenominator() {
        return Denominator;
    }

    private void simplify(Rational x) {
        for (int i = 2; (i <= x.Numerator / 2) || (i <= x.Numerator / 2); i++) {
            while ((x.Numerator % i == 0) || (x.Denominator % i == 0)) {
                x.Numerator /= i;
                x.Denominator /= i;
            }
        }
    }

    public void sum(Rational x) {
        this.Numerator = (this.Numerator * x.Denominator) + (x.Numerator * this.Denominator);
        this.Denominator = this.Denominator * x.Denominator;
    }

    public void subtract(Rational x) {
        this.Numerator = (this.Numerator * x.Denominator) - (x.Numerator * this.Denominator);
        this.Denominator = Denominator * x.Denominator;
    }

    public void multiplier(Rational x) {
        this.Numerator = this.Numerator * x.Numerator;
        this.Denominator = Denominator * x.Denominator;
    }

    public void division(Rational x) {
        this.Numerator = (this.Numerator * x.Denominator);
        this.Denominator = this.Denominator * x.Numerator;
    }

    public void print() {
        System.out.printf("%d/%d\n", Numerator, Denominator);
    }

    public void printPointFloating(int digit) {
        var aux = new DecimalFormat();
        aux.setMaximumFractionDigits(digit);
        System.out.println(aux.format((Numerator / this.Denominator)));
    }
}