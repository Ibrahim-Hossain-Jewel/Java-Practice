import java.util.ArrayList;
import java.util.List;

class BigSum{
    public long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long result = 0l;
        for (int i = 0; i < ar.size(); i++) {
            // int j = i.intValue();
            result+=ar.get(i);
        }
        return result;
    } 
}
public class VeryBigSum {
    public static void main(String[] args) {
        BigSum obj = new BigSum();
        List<Long> data = new ArrayList<Long>(); 
        data.add(11l);
        data.add(12l);
        System.out.println(obj.aVeryBigSum(data));;
    }
}
