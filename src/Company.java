package src;

import src.employees.Employee;
import src.employees.Worker;
import src.employees.Manager;

public class Company {
    public static void main(String[] args) {
        // Tworzenie tablicy pracowników
        Employee[] employees = new Employee[5];

        // Dodawanie pracowników do tablicy
        employees[0] = new Manager("John Doe", 5000.0, 2);
        employees[1] = new Worker("Jane Smith", 3000.0, "Developer");
        employees[2] = new Worker("Alice Johnson", 3500.0, "Designer");
        employees[3] = new Manager("Bob Brown", 5500.0, 1);
        employees[4] = new Worker("Emma Wilson", 3200.0, "Engineer");

        // Zliczanie pracowników, którzy nie są managerami
        int nonManagerEmployeesCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerEmployeesCount++;
            }
        }

        // Ustawianie liczby podwładnych pracownika o indeksie równym 0
        ((Manager)employees[0]).setNumberOfSubordinates(nonManagerEmployeesCount);

        // Ustawianie pensji pracownika o indeksie równym 0 na 7500
        employees[0].setSalary(7500.0);

        // Wyświetlanie danych dla wszystkich pracowników
        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}