import javax.swing.*;

public class CargoInformation {
    private Dimensions dimensions;
    private final int size;
    private final int weight;
    private final String deliveryAddress;
    private final boolean doNotTurn;
    private final String registrationNumber;
    private final boolean fragile;

    public CargoInformation(Dimensions dimensions, int size, int weight, String deliveryAddress,
                            boolean doNotTurn, String registrationNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.size = size;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.doNotTurn = doNotTurn;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }

    public CargoInformation setSize(int size) {
        return new CargoInformation(dimensions, size, weight, deliveryAddress, doNotTurn, registrationNumber, fragile);
    }

    public int getSize() {
        return size;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public CargoInformation setDimensions(Dimensions dimensions) {
        return new CargoInformation(dimensions, size, weight, deliveryAddress, doNotTurn, registrationNumber, fragile);
    }

    public int getWeight() {
        return weight;
    }

    public CargoInformation setWeight(int weight) {
        return new CargoInformation(dimensions, size, weight, deliveryAddress, doNotTurn, registrationNumber, fragile);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public CargoInformation setDeliveryAddress(String deliveryAddress) {
        return new CargoInformation(dimensions, size, weight, deliveryAddress, doNotTurn, registrationNumber, fragile);
    }

    public boolean isDoNotTurn() {
        return doNotTurn;
    }

    public CargoInformation setDoNotTurn(boolean doNotTurn) {
        return new CargoInformation(dimensions, size, weight, deliveryAddress, doNotTurn, registrationNumber, fragile);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public CargoInformation setRegistrationNumber(String registrationNumber) {
        return new CargoInformation(dimensions, size, weight, deliveryAddress, doNotTurn, registrationNumber, fragile);
    }

    public boolean isFragile() {
        return fragile;
    }

    public CargoInformation setFragile(boolean fragile) {
        return new CargoInformation(dimensions, size, weight, deliveryAddress, doNotTurn, registrationNumber, fragile);
    }

    public String toString() {
        return  "Габариты: " + dimensions.volume() + "\n" +
                "Масса: " + size + "\n" +
                "Адрес доставки: " + deliveryAddress + "\n" +
                "Серийный номер посылки: " + registrationNumber;
    }

}
