public class Cpu {
//    частота;
//    количество ядер;
//    производитель;
//    вес.
    private static double  frequency;
    private static int numberOfCores;
    private static String manufacturer;
    private static double weight;

    public Cpu(double frequency, int numberOfCores, String manufacturer, double weight) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public static double getFrequency() {
        return frequency;
    }

    public static int getNumberOfCores() {
        return numberOfCores;
    }

    public static String getManufacturer() {
        return manufacturer;
    }

    public static double getWeight() {
        return weight;
    }

}
