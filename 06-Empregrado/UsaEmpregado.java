public class UsaEmpregado {
    public static void main(String[] args) {
        var emp1 = new Empregado("Lucas", "Cella", 2000.00);
        var emp2 = new Empregado("Vilmar", "Oliveira", 1000.00);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString() + "\n");

        emp1.increaseSalary(10);
        emp2.increaseSalary(10);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString() + "\n");
    }
}