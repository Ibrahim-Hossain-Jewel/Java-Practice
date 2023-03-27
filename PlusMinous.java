public class PlusMinous {
    public static void sixPrecision(int[] m) {
        int positiveNumber = 0;
        double negativeNumber = 0;
        int zeroNumber = 0;

        for (int i = 0; i < m.length; i++) {
            if(m[i]>0){
                positiveNumber++;
            }
            else if(m[i] == 0){
                zeroNumber++;
            }
            else if(m[i]<0){
                negativeNumber++;
            }
        }
        System.out.println("Total positive number : " + positiveNumber);
        System.out.println("Total zero number : " + zeroNumber);
        System.out.println("Total negative number : " + String.format("%.10f", negativeNumber / m.length));
    }
    public static void main(String[] args) {
        int[]  userValue = new int[]{ -4, 3, -9, 0, 4, 1};
        sixPrecision(userValue);
    }
}
