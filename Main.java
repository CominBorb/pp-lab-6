import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Worker worker1 = new Worker("Maciek", 3500, 1, "2023-01-01", "Worker");
        Worker worker2 = new Worker("Jasiek", 3600, 2, "2023-02-01", "Worker");
        Worker worker3 = new Worker("Tadek", 4500, 3, "2023-03-01", "Worker");
        Worker worker4 = new Worker("Kamil", 6000, 4, "2023-04-01", "Worker");
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);

        Manager manager = new Manager("Janusz", 7000, 5, "2023-05-01", "Manager");
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() + ", Position: " +
                    employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " +
                    employee.getSalary() + ")");
            employee.work();
        }
    }
}