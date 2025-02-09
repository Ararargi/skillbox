public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    private static int totalCost = 0;
    private static int totalItem = 0;


    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static int getTotalCost() {
        return totalCost;
    }

    public static int getTotalItem() {
        return totalItem;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public static void increaseTotalCost(int totalPrice, int count)
    { Basket.totalCost = Basket.totalCost + totalPrice * count; }
    public  static int increaseAverageCost(){
        return Basket.totalCost / Basket.totalItem;
    }

    public static void increaseTotalItem(int count) { Basket.totalItem = Basket.totalItem + count; }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price;
        totalPrice = totalPrice + count * price;


    }
    public void add(String name, int price, int count, double weight){
        boolean error = false;
        if (contains(name)){
            error = true;
        }
        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }
        items = items + "\n" + name + " - " +
                count + " шт. - " + price * count + " руб." + " - " + weight * count + " кг";
        totalWeight = totalPrice + count * price * weight;
        totalPrice = totalPrice + count * price;
        increaseTotalItem(count);
        increaseTotalCost(price, count);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }



    public double getTotalWeight() {
        return totalWeight;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
