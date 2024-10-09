import java.util.Comparator;

public class SalaryComparatorDescending implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.getMonthSalary(), e1.getMonthSalary());
    }
}