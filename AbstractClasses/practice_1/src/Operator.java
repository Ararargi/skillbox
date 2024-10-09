public class Operator implements Employee {
    private static final double FIXED_SALARY = 40000;

    @Override
    public double getMonthSalary() {
        return FIXED_SALARY;
    }

    @Override
    public String toString() {
        double salary = getMonthSalary();
        // Округление до двух знаков после запятой
        salary = Math.round(salary * 100.0) / 100.0;
        return "Operator: " + salary + " руб.";
    }
}