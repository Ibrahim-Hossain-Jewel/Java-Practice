import javax.xml.ws.Dispatch;

class CopeUp{
    int id;
    String name;
    int age;
    CopeUp(int id, String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id + name + "your age "+ age);
    }
    CopeUp(Test objTest){
        this.id = objTest.age;
        this.age = objTest.age;
    }
}
public class CopyConstructor {
    /*
     * there is no copy constructor in java however we can copy the value from one object to another object.
     */
    public static void main(String[] args) {
        CopeUp obj = new CopeUp(11, "jewel");
        obj.display();
        Test obj2 = new Test(88,77);
        CopeUp Copyobj = new CopeUp(obj2);
        Copyobj.display();
    }
}

