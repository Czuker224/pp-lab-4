package src.employees;

public class Manager extends Employee {
    public int numberOfSubordinates;

    public Manager(String fullName, double salary, int numberOfSubordinates) {
        super(fullName, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    // Metoda zwracająca liczbę podwładnych
    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    // Metoda ustawiająca nową liczbę podwładnych
    public void setNumberOfSubordinates(int newNumberOfSubordinates) {
        this.numberOfSubordinates = newNumberOfSubordinates;
    }

    // Metoda zwracająca informacje o managerze
    @Override
    public String toString() {
        return "Manager: {" + "FullName: " + this.getName() + "}, Salary: {" + getSalary() + "}, Subordinates: {" + numberOfSubordinates + "}";
    }

}