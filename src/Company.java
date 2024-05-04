package src;

import src.employees.Employee;
import src.employees.Worker;
import src.employees.Manager;

public class Company {
    public static void main(String[] args) {
        // Tworzenie tablicy pracowników
        Employee[] employees = new Employee[7];

        // Dodawanie pracowników do tablicy
        employees[0] = new Manager("John Doe", 5000.0, 2);
        employees[1] = new Worker("Jane Smith", 3000.0, "Developer");
        employees[2] = new Worker("Alice Johnson", 3500.0, "Designer");
        employees[3] = new Manager("Bob Brown", 5500.0, 1);
        employees[4] = new Worker("Emma Wilson", 3200.0, "Engineer");
        employees[5] = new Manager("David Jones", 6000.0, 3); // Nowy Manager
        employees[6] = new Worker("Michael Davis", 3800.0, "Analyst"); // Nowy Worker

        // Aktualizacja pensji pracowników
        for (Employee employee : employees) {
            double newSalary = employee.getSalary() + 500.0;
            employee.setSalary(newSalary);
        }

        // Aktualizacja danych dla Managerów
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(2); // Ustawienie liczby podwładnych
                employee.setSalary(7500.0); // Ustawienie nowej pensji
            }
        }

        // Wyświetlanie zaktualizowanych informacji o pracownikach
        System.out.println("Zaktualizowane informacje o pracownikach:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}