public class Ram {
//    тип;
//    объём;
//    вес.
    private static RamType ramType;
    private static int volume;
    private static double weight;

    public Ram(RamType ramType, int volume, double weight) {
        this.ramType = ramType;
        this.volume = volume;
        this.weight = weight;
    }

    public static RamType getRamType() {
        return ramType;
    }

    public static int getVolume() {
        return volume;
    }

    public static double getWeight() {
        return weight;
    }
}
