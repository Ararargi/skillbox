public class InformationStorage {
//    тип — HDD, SSD;
//    объём памяти;
//    вес.
    private static StorageType storageType;
    private static int volume;
    private static double weight;

    public InformationStorage(StorageType storageType, int volume, double weight) {
        this.storageType = storageType;
        this.volume = volume;
        this.weight = weight;
    }

    public static StorageType getStorageType() {
        return storageType;
    }

    public static int getVolume() {
        return volume;
    }

    public static double getWeight() {
        return weight;
    }
}
