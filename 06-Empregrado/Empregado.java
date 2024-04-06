public class Empregado {
    private String Name;
    private String LastName;
    private double Salary;

    public Empregado(String name, String lastName, double salary) {
        Name = name;
        LastName = lastName;
        Salary = salary > 0 ? salary : 0;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public double ChangeSalary() {
        return Salary;
    }

    public void increaseSalary(double Ajustement) {
        Salary += (Salary / Ajustement);
    }

    public double yearlySalary() {
        return Salary * 12;
    }

    public String toString() {
        return String.format("Name: %s\nLast Name: %s\nSalary: %f", Name, LastName, Salary);
    }
}
