public class UsaRational {
    public static void main(String[] args) {
        var n1 = new Rational(4, 8);
        var n2 = new Rational();

        n1.print();
        n2.print();

        n1.sum(n2);

        n1.print();
    }
}