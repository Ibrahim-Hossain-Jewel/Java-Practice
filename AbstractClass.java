abstract class MathematicalOperation{
    public abstract void sum(); //abstract class contain abstract method and non abstract mehtod
    public void mul(){
        System.out.println("Hello Multiplication");
    }
}
class calculate extends MathematicalOperation{
    @Override
    public void sum(){
        System.out.println(12+99);
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        calculate obj = new calculate();
        obj.sum();
        obj.mul();
        MathematicalOperation obj2 = new MathematicalOperation();
        //Abstract class can not be instantiate

        };
    }
}
