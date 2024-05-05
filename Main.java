import company.models.Manager;
import company.models.Worker;


public class Main {
    public static void main(String[] args) {
        //Worker1 i Worker2 mają ten sam nr ID
        Worker worker1 = new Worker("John Doe", 2500, 1, "2023-01-01", "System Analyst");
        Worker worker2 = new Worker("Kristen James", 3000, 1, "2023-02-02", "QA Tester");
        Worker worker3 = new Worker("Oliver Power", 2200, 3, "2023-04-05", "Junior Developer");
        Worker worker4 = new Worker("Raphael Jacobs", 4000, 4, "2020-01-20", "Senior Software Engineer");

        Manager manager = new Manager("Edward", 5000, 5, "2018-08-17", "Department Head");

        // Wywołanie hashCode
        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker3.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker4.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        // Porównanie instancji
        System.out.println(worker2.getName() + " equals worker1: " + worker2.equals(worker1));
        System.out.println(worker2.getName() + " equals worker3: " + worker2.equals(worker3));
        System.out.println(worker2.getName() + " equals manager: " + worker2.equals(manager));
    }
}
