public class Main {

    public static void main(String[] args) {
        Basket olyabasket = new Basket();
        olyabasket.add("Milk", 40, 3, 3);
        olyabasket.add("Хлеб", 50,2,0.25);
        olyabasket.print("КОРЗИНА");
        Basket irabasket = new Basket();
        irabasket.add("Гречка", 50,2,0.5);
        irabasket.add("Яблоко", 75,5,5);
        irabasket.print("Корзина 2");
        System.out.println(Basket.getTotalItem());
        System.out.println(Basket.getTotalCost());
        System.out.println(Basket.increaseAverageCost());

       /* System.out.println("Введите первое число");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число");
        int b = new Scanner(System.in).nextInt();

        Arithmetic calculations = new Arithmetic(a, b);
        calculations.sum();
        calculations.multiplication();
        calculations.max();
        calculations.min();
        System.out.println("Сумма чисел равна: " + calculations.sum());
        System.out.println("Сумма произведения чисел равна: " + calculations.multiplication());
        System.out.println("Минимальное число: " + calculations.min());
        System.out.println("Максимальное число: " + calculations.max());*/

    }
}
