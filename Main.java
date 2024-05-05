import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John Doe", 2500, 1, "2023-01-01", "System Analyst");
        Worker worker2 = new Worker("Kristen James", 3000, 2, "2023-02-02", "QA Tester");                 // ID2
        Worker worker3 = new Worker("Oliver Power", 2200, 3, "2023-04-05", "Junior Developer");   //ID3
        Worker worker4 = new Worker("Raphael Jacobs", 4000, 4, "2020-01-20", "Senior Software Engineer");
        Worker worker5 = new Worker("Dan James", 4000, 1, "2023-02-02", "Junior Developer");
        Worker worker6 = new Worker("Jason Lami", 5000, 3, "2023-04-05", "Senior Developer");;  // ID3

        Manager manager = new Manager("Fenix Elordi", 5000, 5, "2018-08-17", "Department Head");
        Manager manager2 = new Manager("Edward Basic", 5000, 2, "2018-08-17", "General Manager");              // ID 2

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager);
        employees.add(manager2);

        double totalSalary = 0.0;
        double totalManagerSalary = 0.0;
        double totalWorkerSalary = 0.0;

        Map<Integer, List<Employee>> idMap = new HashMap<>();
        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
            if (emp instanceof Manager) {
                totalManagerSalary += emp.getSalary();
            } else if (emp instanceof Worker) {
                totalWorkerSalary += emp.getSalary();
            }

            if (idMap.containsKey(emp.getId())) {
                idMap.get(emp.getId()).add(emp);
            } else {
                List<Employee> empList = new ArrayList<>();
                empList.add(emp);
                idMap.put(emp.getId(), empList);
            }
        }

        System.out.println("Total salary: " + totalSalary);
        System.out.println("Total manager salary: " + totalManagerSalary);
        System.out.println("Total worker salary: " + totalWorkerSalary);


        for (Map.Entry<Integer, List<Employee>> entry : idMap.entrySet()) {
            List<Employee> empList = entry.getValue();
            if (empList.size() > 1) {
                System.out.println("Employees with same ID: ");
                for (Employee emp : empList) {
                    System.out.println("- " + emp.getName());
                }
            }
        }
    }
}
