import company.models.Worker;
import company.models.Manager;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John Doe", 2500, 1);
        Worker worker2 = new Worker("Kristen James", 3000, 2);
        Worker worker3 = new Worker("Oliver Power", 2200, 3);
        Worker worker4 = new Worker("Raphael Jacobs", 2800, 4);

        Manager manager = new Manager("Edward Rain", 5000, 5);

        System.out.println("Salary of worker 1: " + worker1.getName() + ": " + worker1.getSalary());
        worker1.work();

        System.out.println("Salary of worker 2: " + worker2.getName() + ": " + worker2.getSalary());
        worker2.work();

        System.out.println("Salary of worker 3: " + worker3.getName() + ": " + worker3.getSalary());
        worker3.work();

        System.out.println("Salary of worker 4: " + worker4.getName() + ": " + worker4.getSalary());
        worker4.work();

        System.out.println("Salary of manager: " + manager.getName() + ": " + manager.getSalary());
        manager.work();
    }
}
