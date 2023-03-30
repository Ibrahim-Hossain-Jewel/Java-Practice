//Emplyee class that has an object of the Address class.
public class Employee{
    String name;
    int id;
    Address address;

    public Employee(String name, int id, Address address){
        this.name = name;
        this.id = id;
        this.address = address;
    }
    void display(){
        System.out.println("Employee ID : " + id + "Empolyee Name : " + name + "Emplyee Country : " + address.country);
    }
    public static void main(String[] args) {
        Address EmplyeeAddress = new Address("Rampura", "Bangladesh", "Dhaka");
        Employee obj = new Employee("Jewel", 1, EmplyeeAddress);
        System.out.println("Address ");
        EmplyeeAddress.display();
        System.out.println("Employee information");
        obj.display();
    }
}