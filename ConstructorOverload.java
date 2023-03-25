
class Test{
    String name = "jewel";
    int age = 0;
    int roll = 0;
    //constructor overloaded by changing the number of parameters name;
    public Test(int age){
        this.age = age;
    }
    public Test(int age, int roll){
        this.roll = roll;
        this.age = age;
    }
    public void display(){
        System.out.println("Your age : " + age + " Your roll : " + roll);
    }
}
public class ConstructorOverload {
    public static void main(String[] args) {
        Test defaultConst = new Test(25);
        defaultConst.display();
        Test overloadedconstructor = new Test(26, 33);
        overloadedconstructor.display();
    }
}
