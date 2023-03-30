import java.util.Arrays;

public class LargestElement {
    //find out the largest element from an array.
    public static void main(String[] args) {
        int[] arr = new int[]{18, 90, 90, 13, 90, 75, 90, 8, 90, 43};
        Arrays.sort(arr);
        // int max = 0;
        int total = 0;
        // for(int i = 0; i<arr.length; i++){
        //     if (arr[i] >= max) {
        //         total= total + 1;
        //         max=arr[i];
        //         System.out.println("__");
                
        //     }
        // }
        // System.out.println("your maximum value : " + max + " total value "+ total);
        
        Arrays.sort(arr);
        int candles = 0, longest = arr[arr.length - 1];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (longest == arr[i]) {
                candles = candles + 1;
            } else {
                break;
            }
        }
        System.out.println(candles);;
    }
}
