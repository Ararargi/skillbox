
public class Computer {
    public final String vendor;
    public final String name;
    public  Cpu cpu;
    public  Ram ram;
    public InformationStorage storage;
    public  Screen screen;
    public Keyboard keyboard;

    public Computer(String vendor, String name){
        this.vendor = vendor;
        this.name = name;

    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public Cpu getCpu() {
        return cpu;
    }


    public Ram getRam() {
        return ram;
    }

    public InformationStorage getStorage() {
        return storage;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public double getTotalWeight() {
        return Cpu.getWeight() + Ram.getWeight() + InformationStorage.getWeight() + Screen.getWeight() + Keyboard.getWeight();
    }

    public Computer setName(String name){
        return new Computer(vendor, name);
    }

    public Computer setVendor(String vendor){
        return new Computer(vendor, name);
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void setStorage(InformationStorage storage) {
        this.storage = storage;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String toString(){
        return "Название компьютера: " + name + "\n" +
                "Производитель компьютера: " + vendor + "\n" +
                "Процессор фирмы: " + Cpu.getManufacturer() + "\n" +
                "Количество ядер: " + Cpu.getNumberOfCores() + "\n" +
                "Частота: " + Cpu.getFrequency() + " ГГц" + "\n" +
                "Оперативная память: " + Ram.getRamType() + "\n" +
                "Объем памяти: " + Ram.getVolume() + "\n" +
                "Информация о накопителе: " + InformationStorage.getStorageType() + "\n" +
                "Объем памяти: " + InformationStorage.getVolume() + "\n" +
                "Экран диагональю: " + Screen.getDiagonal() + " дюймов" + "\n" +
                "Тип экрана: " + Screen.getScreenType() + "\n" +
                "Тип клавиатуры: " + Keyboard.getKeyboardType() + "\n" +
                "Наличие LED подсветки: " + Keyboard.getKeyboardBacklight() + "\n" +
                "Общий вес: " + getTotalWeight() + "грамм." + "\n";
    }

}

