/**
 * Parent try and catch(){} block is checked exception
 * when try catch block not required then it is called 
 */
class Parent {
    String name;
    String Profession;
    Parent(String name, String profession) {
        this.name = name;
        this.Profession = profession;
    }
    //if a super class method does not declare an exception the subclass overriden method
    //can not declare the chekcked exception. is it true or not
    void printName() {
        System.out.println("Name: " + name);
    }
}
public class OverrideException {
    public static void main(String[] args) {
        System.out.println("override exception");
        try{
            int x = 11/0;
            System.out.println(x);
        }catch (Exception m){
            System.out.println(m);
        }
    }
}
