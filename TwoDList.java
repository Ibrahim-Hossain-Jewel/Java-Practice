import java.util.ArrayList;
import java.util.List;

public class TwoDList {
    public static  void iterateUsingForEach(List<List<Integer>> listOfLists) {
        //execute for loop to find out the list of list.
        int x = 0;
        int y = 0;
        for(int i =0; i<listOfLists.size(); i++){
            for(int j = 0; j<listOfLists.get(i).size(); j++){
                if(i == j){
                    System.out.println("Your left to right : "+listOfLists.get(i).get(j));
                    x+=listOfLists.get(i).get(j);
                }
            }
        }
        for(int i = 0; i<listOfLists.size(); i++){
            for(int j = listOfLists.get(i).size() -1; j>-1; j--){
                if(i+j == listOfLists.get(i).size() -1){
                    System.out.println("right to left : " + listOfLists.get(i).get(j));
                    y+=listOfLists.get(i).get(j);
                }
            }
        }
        System.out.println("your absolute value : "+ Math.abs(x-y));
    }
    public static void main(String[] args) { 
        //2D array define complete.
        List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
        List<Integer> data1 = new ArrayList<>();
        data1.add(11);
        data1.add(2);
        data1.add(4);
        listOfList.add(data1);

        List<Integer> data2 = new ArrayList<Integer>();
        data2.add(4);
        data2.add(5);
        data2.add(6);
        listOfList.add(data2);

        List<Integer> data3 = new ArrayList<>();
        data3.add(10);
        data3.add(8);
        data3.add(-12);
        listOfList.add(data3);

        iterateUsingForEach(listOfList);

    }
}
