import company.models.Manager;
import company.models.Worker;


public class Main {
    public static void main(String[] args) {
        //Worker1 i Worker2 mają ten sam nr ID
        Worker worker1 = new Worker("John Ryder", 3000, 1, "2023-01-01", "QA Tester");
        Worker worker2 = new Worker("Dan James", 4000, 1, "2023-02-02", "Junior Developer");
        Worker worker3 = new Worker("Jason Lami", 5000, 3, "2023-04-05", "Senior Developer");

        Manager manager = new Manager("Fenix Elordi", 5000, 5, "2018-08-17", "Department Head");

        // Wywołanie hashCode
        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        // Porównanie instancji
        System.out.println(worker2.getName() + " equals worker1: " + worker2.equals(worker1));
        System.out.println(worker2.getName() + " equals worker3: " + worker2.equals(worker3));
        System.out.println(worker2.getName() + " equals manager: " + worker2.equals(manager));
    }
}
