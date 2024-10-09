public class Keyboard {
//    тип;
//наличие подсветки;
//вес.
    private static KeyboardType keyboardType;
    private static KeyboardBacklight keyboardBacklight;
    private static double weight;

    public Keyboard(KeyboardType keyboardType, KeyboardBacklight keyboardBacklight, double weight) {
        this.keyboardType = keyboardType;
        this.keyboardBacklight = keyboardBacklight;
        this.weight = weight;
    }

    public static KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public static KeyboardBacklight getKeyboardBacklight() {
        return keyboardBacklight;
    }

    public static double getWeight() {
        return weight;
    }
}
