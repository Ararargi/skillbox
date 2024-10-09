import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Elevator elevator = new Elevator(-3, 12);
//        while (true) {
//            System.out.print("Введите номер этажа: ");
//            int floor = new Scanner(System.in).nextInt();
//            elevator.move(floor);
//        }
        Dimensions dimensions = new Dimensions(150, 120,10);
        dimensions = dimensions.setHeight(140);
        dimensions = dimensions.setWidth(160);
        dimensions = dimensions.setLength(20);

        CargoInformation cargoInformation = new CargoInformation(dimensions, 420, 52,
                "Kazan",true, "152365468", true);
        System.out.println(cargoInformation);
    }
}