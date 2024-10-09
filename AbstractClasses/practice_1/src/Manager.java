import java.util.Random;

//Manager — зарплата складывается из фиксированной части и бонуса в виде 5%
//        от заработанных для компании денег. Количество заработанных денег
//        для компании генерируйте случайным образом от 115 000 до 140 000 рублей.
public class Manager implements Employee {
    static final double FIXED_SALARY = 50000;
    private double randomSalary;

    public Manager(){
        this.randomSalary = generateRandom();
    }
    private double generateRandom(){
        Random random = new Random();
        return  115000 + (25000 * random.nextDouble());
    }
    @Override
    public double getMonthSalary() {
        return FIXED_SALARY + (0.05 * randomSalary);
    }

    @Override
    public String toString() {
        double salary = getMonthSalary();
        salary = Math.round(salary * 100.0) / 100.0;
        return "Manager: " + salary + " руб.";
    }
}