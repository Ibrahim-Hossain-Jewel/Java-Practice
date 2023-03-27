public class Student implements Cloneable{
    String name;
    int id;
    Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    void display(){
        System.out.println("Student name : "+ name + "Student ID : " + id);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
