public class StairCase {
    //stair case using java
    public static void main(String[] args) {
        int n = 4;
        int nest = n;
        String val = "";
        for (int i = 0; i <n; i++) {
            for (int j = nest-1; j>0; j--) {
                val+=" ";
            }
            for (int k = 0; k <= i; k++) {
                val+="#";
            }
            nest--;
            val+="\n";
        }
        System.out.println(val);
    }
}
