public class Screen {
//    диагональ;
//    тип (IPS, TN, VA);
//    вес.
    private static int diagonal;
    private static ScreenType screenType;
    private static double weight;

    public Screen(int diagonal, ScreenType screenType, double weight) {
        this.diagonal = diagonal;
        this.screenType = screenType;
        this.weight = weight;
    }

    public static int getDiagonal() {
        return diagonal;
    }

    public static ScreenType getScreenType() {
        return screenType;
    }

    public static double getWeight() {
        return weight;
    }
}
