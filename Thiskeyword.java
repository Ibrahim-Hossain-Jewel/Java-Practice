public class Thiskeyword {
    //this can be used to return the current class instance from a method.
    int id  = 99;
    //can this keyword used to refer static context
    static int roll = 24;
    public int age = 0;
    public String name = "";

    public Thiskeyword (){
        // this = null; //you can not assign a value to the this keyword because the this keyword is final variable.
        System.out.println("this keyword used to refer" + this.roll);
    }
    public Thiskeyword(String name){
        this.name = name;
    }
    //constructor chaining -> when calling one constructor from another constructor then it's call constructor chaining.
    public Thiskeyword (int age, int roll, String name){
        this(name); //constructor chaining 
        this.age = age;
        this.roll = roll;
        System.out.println("name : " + name + "age : " + age + "Roll : " + roll);
    }
    public static void main(String[] args) {
        Thiskeyword obj = new Thiskeyword();
        Thiskeyword info = new Thiskeyword(26, 24, "ibrahim hossain");

    }
}
