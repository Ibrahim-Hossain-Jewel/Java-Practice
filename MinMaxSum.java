public class MinMaxSum {
    public static void SpecificElementCalculator(int[] ar){
        int counter = 0;
        int[] result = new int[ar.length];
        for (int j = 0; j < ar.length; j++) {
            for (int i = 0; i < ar.length; i++) {
                if (!(i == j)) {
                    result[j] += ar[i];
                }
            }
        }
        System.out.println(result[result.length - 1] + " " + result[0]);
    }
    public static void main(String[] args) {
        SpecificElementCalculator(new int[]{7, 69, 2, 221, 8974});
    }
}
