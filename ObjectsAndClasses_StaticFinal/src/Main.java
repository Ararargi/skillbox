

public class Main {
    public static void main(String[] args) {
        Cpu cpu1 = new Cpu(2.4, 8, "Intel",85);
        Cpu cpu2 = new Cpu(2.2,8, "AMD",80);
        Ram ram1 = new Ram(RamType.DDR3,16,50);
        Ram ram2 = new Ram(RamType.DDR4,32,100);
        InformationStorage storage1 = new InformationStorage(StorageType.SSD, 512,200);
        InformationStorage storage2 = new InformationStorage(StorageType.HDD,1024, 450);
        Screen screen1 = new Screen(55, ScreenType.VA, 1500);
        Screen screen2 = new Screen(45,ScreenType.IPS, 800);
        Keyboard keyboard1 = new Keyboard(KeyboardType.MECHANICAL, KeyboardBacklight.YES, 250);
        Keyboard keyboard2 = new Keyboard(KeyboardType.OPTICAL, KeyboardBacklight.NO,250);


        Computer computer1 = new Computer("ICL","15225");
        Computer computer2 = new Computer("AMD", "RAZOR2");




        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
    }
}

