abstract class parent{
    String lastname = "Hossain";
    public abstract void returnLastName();
}
class child extends parent{
    public void returnLastName(){
        System.out.println("Hello concrete class method.");
    }
}
public class ConcreteClass {
    //concrete class always extend abstract class.
    public static void main(String[] args) {
        System.out.println("Initialize the concrete class");
        child obj = new child(); //calling the child class.
        obj.returnLastName();
    }
}
