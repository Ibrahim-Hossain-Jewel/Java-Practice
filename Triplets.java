import java.util.ArrayList;
import java.util.List;

public class Triplets {
    public static void main(String[] args) {
        List<Integer> obj = new ArrayList<>();
        obj.add(17);
        obj.add(28);
        obj.add(30);
        List<Integer> obj2 = new ArrayList<>();
        obj2.add(99);
        obj2.add(16);
        obj2.add(8);
        System.out.println(obj + " " + obj2);
        List<Integer> score = new ArrayList<>();
        int aliceScore = 0;
        int bobScore = 0;
        for(int i = 0;i<obj.size(); i++){
            if(obj.get(i) > obj2.get(i)){
               aliceScore+=1;
            }else if(obj2.get(i) > obj.get(i)){
                bobScore+=1;
            }
        }
        score.add(aliceScore);
        score.add(bobScore);
        System.out.println(score);
    }
}
