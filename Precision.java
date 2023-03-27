public class Precision {
    public static void main(String[] args) {
        double val = 9.0;
        System.out.println("Precision " + String.format("%.10f", val));
        float m = 99;
        System.out.println(String.format("%.10f", m)); //floating point "%.10f"
    }
}
