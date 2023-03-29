import java.util.Arrays;

public class ArraySort {
    //implementing the sorting algorithm.
    public static int[] sortingFunc(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        int[] x = {300,1,11,344,88,2,99,376,44,50};
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ,");
        }
        int[] yourArray = sortingFunc(x);
        System.out.println("Your sorted array are below");
        for (int i = 0; i < yourArray.length; i++) {
            System.out.print(yourArray[i] + ", ");
        }
    }
}
