class Student{
    void A(){
        System.out.println("I need a computer ");
    }
}
class Computer{
    void A(){
        System.out.println("I don't have a computer");
    }
}
class All extends Student, Computer{ //multiple inheritance is not possible its makes compile time error.

}
public class MultipleInheritance {
    public static void main(String[] args) {
        All obj = new All();
        obj.A(); // if the multiple inheritance is support then it make the ambiguty compile time error.
    }
}
