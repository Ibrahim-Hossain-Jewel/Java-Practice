
public class ArraySort {
    public static void main(String[] args) {
        //sort this array using bubble sort -> compare the second element with the first element
        int arr[] = {4, 2, 3, 4, 2, 3, 4, 2, 3}; //reflecting in the original array.
        int temp = 0;
        String[] result = new String[arr.length];
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]> arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]  =  temp;
                }
            }
            System.out.print(arr[i]);
            result[i] = arr[i] + ",";
        }
        
    }
}
