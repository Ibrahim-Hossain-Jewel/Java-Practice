import java.util.ArrayList;

public class ArrayExcept {
    public static void main(String[] args) {
        ArrayList<Integer> ai = new ArrayList<>(5);
        ai.add(7);
        ai.add(69);
        ai.add(2);
        ai.add(221);
        ai.add(8974);
        int total =0;
        int max = ai.get(0);
        int min = ai.get(0);
        for(int n : ai){
            total+=n;
            if (n<min) {
                min = n;
            }
            if (n>max) {
                max = n;
            }
        }
        System.out.println((total - min) + " " + (total - max));

    }
}