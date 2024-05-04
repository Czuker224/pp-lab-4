package src;

public class Company {
    public static void main(String[] args) {
        // Tworzenie tablicy pracowników
        Employee[] employees = new Employee[5];

        // Dodawanie pracowników do tablicy
        employees[0] = new Employee("John Doe", 3000.0);
        employees[1] = new Employee("Jane Smith", 3500.0);
        employees[2] = new Employee("Alice Johnson", 4000.0);
        employees[3] = new Employee("Bob Brown", 3200.0);
        employees[4] = new Employee("Emma Wilson", 3800.0);

        // Wyświetlanie danych dla pracownika o indeksie równym 3
        System.out.println("Dane dla pracownika o indeksie 3:");
        System.out.println(employees[3]);

        // Modyfikowanie pensji dla pracownika o indeksie równym 3
        employees[3].setSalary(3500.0);

        // Wyświetlanie danych dla wszystkich pracowników
        System.out.println("\nDane dla wszystkich pracownikow:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}