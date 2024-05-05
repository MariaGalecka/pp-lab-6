import java.util.ArrayList;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John Doe", 2500, 1, "2023-01-01", "System Analyst");
        Worker worker2 = new Worker("Kristen James", 3000, 2, "2023-02-02", "QA Tester");
        Worker worker3 = new Worker("Oliver Power", 2200, 3, "2023-04-05", "Junior Developer");
        Worker worker4 = new Worker("Raphael Jacobs", 4000, 4, "2020-01-20", "Senior Software Engineer");

        Manager manager = new Manager("Edward", 5000, 5, "2018-08-17", "Department Head");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee emp : employees) {
            System.out.println("- " + emp.getName() + " (ID: " + emp.getId() +
                    ", Position: " + emp.getPosition() +
                    ", Hire date: " + emp.getHireDate() +
                    ", Salary: " + emp.getSalary() + ")");
            emp.work();
        }
    }
}
