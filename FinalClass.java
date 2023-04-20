final class student{
    final class m {
        void x (){
            System.out.println("Hi m");
        }
    }    
}
class another extends student{
    //final class can not be extends
}
public class FinalClass{
    public static void main(String[] args) {
        System.out.println("Initializing the finalClass");
        student n = new student();
        student.m obj = n.new m();
        obj.x();
    }
}