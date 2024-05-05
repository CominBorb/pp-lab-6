import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Worker worker1 = new Worker("Maciek", 3500, 1, "2023-01-01", "Pracownik");
        Worker worker2 = new Worker("Jasiek", 3600, 2, "2023-02-01", "Pracownik");
        Worker worker3 = new Worker("Tadek", 4500, 2, "2023-03-01", "Pracownik"); // Ten sam ID co worker2
        Worker worker4 = new Worker("Kamil", 6000, 4, "2023-04-01", "Pracownik");
        Worker worker5 = new Worker("Ania", 4100, 6, "2023-05-01", "Pracownik"); // Nowy pracownik z nowym ID
        Worker worker6 = new Worker("Ola", 4800, 2, "2023-06-01", "Pracownik"); // Ten sam ID co worker2 i worker3
        Manager manager1 = new Manager("Janusz", 7000, 5, "2023-07-01", "Manager");
        Manager manager2 = new Manager("Krzysztof", 7500, 8, "2023-08-01", "Manager"); // Nowy manager z nowym ID

        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(worker6);
        employees.add(manager1);
        employees.add(manager2);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("Całkowita suma pensji wszystkich pracowników: " + totalSalary);
        System.out.println("Całkowita suma pensji wszystkich Manager: " + totalManagerSalary);
        System.out.println("Całkowita suma pensji wszystkich Worker: " + totalWorkerSalary);

        System.out.println("Pracownicy z tym samym ID:");
        for (Employee employee : employees) {
            for (Employee other : employees) {
                if (employee != other && employee.hashCode() == other.hashCode()) {
                    System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() + ")");
                    break;
                }
            }
        }
    }
}