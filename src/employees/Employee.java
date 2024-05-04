package src.employees;

public class Employee {
    private String fullName;
    private double salary;

    // Konstruktor
    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    // Metoda zwracająca imię i nazwisko pracownika
    public String getName() {
        return fullName;
    }

    // Metoda zwracająca pensję pracownika
    public double getSalary() {
        return salary;
    }

    // Metoda ustawiająca nową wartość pensji pracownika
    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }

    // Metoda zwracająca informacje o pracowniku
    @Override
    public String toString() {
        return "Employee: {" + fullName + "}, Salary: {" + salary + "}";
    }
}