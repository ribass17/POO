public class Complexo {
    private double Real;
    private double Imag;

    public Complexo(double real) {
        Real = real;
    }

    public Complexo(double real, double imag) {
        Real = real;
        Imag = imag;
    }

    public void inicializaNumero(double real, double imag) {
        Real = real;
        Imag = imag;
    }

    public void imprimeNumero() {
        System.out.println(Real + " + " + Imag + "i");
    }

    public boolean eIgual(Complexo n1) {
        if ((Real == n1.Real) && (Imag == n1.Imag))
            return true;
        return false;
    };

    public void soma(Complexo n1) {
        Real += n1.Real;
        Imag += n1.Imag;
    }

    public void subtrai(Complexo n1) {
        Real -= n1.Real;
        Imag -= n1.Imag;
    }

    public void multiplica(Complexo n1) {
        Real = (Real * n1.Real) - (Imag * n1.Imag);
        Imag = (Real * n1.Imag) + (Imag * n1.Real);
    }

    public void divide(Complexo n1){
        Real = (n1.Real*Real)+();
        Imag = (Real * n1.Imag) + (Imag * n1.Real);
    }

}