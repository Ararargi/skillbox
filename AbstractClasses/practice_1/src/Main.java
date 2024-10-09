import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("test", 10000000);

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            employees.add(new Operator());
        }
        for (int i = 0; i < 80; i++) {
            employees.add(new Manager());
        }
        for (int i = 0; i < 10; i++) {
            employees.add(new TopManager(company));
        }
        company.hireAll(employees);

        System.out.println("Top 15 highest salaries:");
        printSalaries(company.getTopSalaryStaff(15));

        System.out.println("Lowest 30 salaries:");
        printSalaries(company.getLowestSalaryStaff(30));

        // Fire 50% of employees
        List<Employee> employeesToFire = new ArrayList<>(employees.subList(0, employees.size() / 2));
        for (Employee employee : employeesToFire) {
            company.fire(employee);
        }

        System.out.println("Top 15 highest salaries after firing 50%:");
        printSalaries(company.getTopSalaryStaff(15));

        System.out.println("Lowest 30 salaries after firing 50%:");
        printSalaries(company.getLowestSalaryStaff(30));
    }

    private static void printSalaries(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}