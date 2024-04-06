public class UsaComplexo {
    public static void main(String[] args) {
        Complexo n1 = new Complexo(1.0, 2.0);
        Complexo n2 = new Complexo(2.0, 1.0);

        n1.soma(n2);

        n1.imprimeNumero();
        System.out.println(n1.eIgual(n2));
    }
}