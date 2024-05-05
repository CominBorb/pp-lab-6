import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();

        Worker worker1 = new Worker("Maciek", 3500, 1, "2023-01-01", "Pracownik");
        Worker worker2 = new Worker("Jasiek", 3600, 2, "2023-02-01", "Pracownik");
        Worker worker3 = new Worker("Tadek", 4500, 2, "2023-03-01", "Pracownik"); 

        Manager manager = new Manager("Janusz", 7000, 5, "2023-05-01", "Manager");

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);

        for (Worker worker : workers) {
            System.out.println(worker.getName() + " has code: " + worker.hashCode());
        }

        Worker duplicateIdWorker = worker3;
        for (Worker worker : workers) {
            if (!worker.equals(duplicateIdWorker)) {
                System.out.println(worker.getName() + " does not have the same ID as " + duplicateIdWorker.getName());
            }
        }
        if (!manager.equals(duplicateIdWorker)) {
            System.out.println(manager.getName() + " does not have the same ID as " + duplicateIdWorker.getName());
        }
    }
}