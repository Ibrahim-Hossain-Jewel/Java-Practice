import java.util.Scanner;
public class DiagonalMatrix2DArray {
    public static void main(String[] args) {
        System.out.println("Enter your array value : ");
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        int[][] arr = new int[val][val]; //declared two dimensional array;
        for(int i = 0; i<val; i++){
            for(int j = 0; j<val; j++){
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("Output of the matrix");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                System.out.println(arr[i][j]);
            }
            System.out.println("\n");
        }
        //findout the left-right diagonal matrix problem solution.
        System.out.println("Your additional diagonal matrix problem solutions");
        Integer result = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(i == j){
                    System.out.println(arr[i][j]);
                    result+=arr[i][j];
                }
            }
        }
        System.out.println("our len : " + result);
        
    }
}
