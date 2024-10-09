//Создайте класс компании Company, содержащей сотрудников и реализующей методы:
//
//        найм одного сотрудника — hire(Employee employee),
//        найм списка сотрудников – hireAll(Collection<Employee> employes),
//        увольнение сотрудника – fire(Employee employee),
//        получение значения дохода компании – getIncome().

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Company {
    public List<Employee> employees = new ArrayList<>();
    public double inCome;
    public String name;

    public void setInCome(double inCome) {
        this.inCome = inCome;
    }

    public double getInCome() {
        return inCome;
    }

    public Company(String name, double inCome) {
        this.inCome = inCome;
        this.name = name;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(Collection<Employee> employee) {
        employees.addAll(employee);
    }

    public void fire(Employee employee) {
        employees.remove(employee);
    }


    public List<Employee> getTopSalaryStaff(int count) {
        employees.sort(Comparator.comparing(Employee::getMonthSalary).reversed());
        return employees.subList(0, Math.min(count, employees.size()));
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        employees.sort(Comparator.comparing(Employee::getMonthSalary));
        return employees.subList(0, Math.min(count, employees.size()));
    }

}

