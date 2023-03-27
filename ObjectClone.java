public class ObjectClone {
    /*
     * Copy one object to another class. sets one object value to another.
     * 
    */
    public static void main(String[] args) throws CloneNotSupportedException {
        Student obj = new Student("jewel vai", 0);
        obj.display();
        Student cloneObject = (Student)obj.clone();
        cloneObject.display();
        //Create an object using copy constructor;
        Teacher copyCons = new Teacher("Software engineer");
        copyCons.display();
    }
}
