//TopManager — зарплата складывается из фиксированной части и бонуса в виде 150%
//        от заработной платы, если доход компании более 10 млн рублей.

public class TopManager implements Employee{
    private final double FIX_SALARY = 50_000;
    private double MONT_SALARY;
    private Company company;

    public TopManager(Company company){
        this.company  = company;
    }


    @Override
    public double getMonthSalary() {
        if (company.getInCome()>= 10_000_000){
            MONT_SALARY = FIX_SALARY + (FIX_SALARY * 150) / 100;
        } else {
            MONT_SALARY = FIX_SALARY;
        }
        return MONT_SALARY;
    }

    @Override
    public String toString() {
        return "Топ Менеджер: " + MONT_SALARY + " руб.";
    }
}
