class Parent{
    String name;
    int age;
    Parent(String name, int age){
        this.name = name;
        this.age = age; 
    }
    void display(){
        System.out.println("Name : " + name + "Age : " + age);
    }
}
class Child extends Parent{
    //super enables the immediate parent class constructor/ instance/ method.
    Child(String name, int age){
        super(name, age);
    }
    void display(){
        System.out.println("Name : " + name + "Age : " + age);
    }
    
}
public class SuperKey {
    public static void main(String[] args) {
        Child c = new Child("jewel" , 22);
        Parent p = c;
        System.out.println(p.age);
        c.display();
    }
}
