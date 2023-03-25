//default constructor used to assign the default value to the object.
class Student{
    //the default constructor used to initialized the default value what does it mean by the default value.
    //default value means default properties or default value
    String name;
    int age;
    public Student(){
        this.name = "Jewel"; //the default constructor implicitly returns the current instance of the class
    // here using the this keyword used to define the current instance of the class
        this.age = 99;
    }
    public void display(){
        System.out.println("initialize the default value of the object " + name  + "AGE:"+ age);
    }
}
public class User{
    public static void main(String[] args) throws Exception {
        //findout the environment variable
       Student obj = new Student();
        obj.display();
    }
}