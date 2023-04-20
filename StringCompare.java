public class StringCompare {
    public static void main(String[] args) {
        //String compare using java
        String s1 = "Hello"; 	//String literal (literal concatenation)
        String s2 = "Hello";
        String s3 = "Hello";
        String s4 = new String("Hello");
        if(s1 == s2 && s3 == s1){
         System.out.println("Same string");   
        }if (s4 != s1) {
            System.out.println("s1 and s4 is not same");
        }
    }
}
