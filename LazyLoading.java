import java.util.List;
import java.util.ArrayList;

interface IcontactList{
    public List<Employees> getEmployeesList(); 
}
class Company{
    String cName;
    String cAddress;
    String cContactNo;
    IcontactList contactList; 
    //this reference can contain only a list since its contain a list of employees.
    public Company(String cName, String cAddress, String cContactNo, IcontactList contactList){
        this.cName = cName;
        this.cAddress = cAddress;
        this.cContactNo = cContactNo;
        this.contactList = contactList;
    }
    //Get method to retrieve the company.
    public String getCName(){return this.cName;}
    public String getCAddress(){return this.cAddress;}
    public String getCContactNo(){return this.cContactNo;}
    public IcontactList getContactList(){return this.contactList;}
}
class ContactList implements IcontactList{
    @Override
    public List<Employees> getEmployeesList(){
        return getEmpList();
    }
    //makes a static method due to lazy initialization.
    //this method return employee types list
    public static List<Employees> getEmpList(){
        List<Employees> empList = new ArrayList<Employees>(5);
        empList.add(new Employees("Mukesh", 3452.99, "JSE"));
        empList.add(new Employees("Amit", 22345, "ASE"));
        empList.add(new Employees("Naman", 84848, "G4"));
        empList.add(new Employees("Vipal", 44477, "SDE1"));
        empList.add(new Employees("CodeGeeX", 55555, "DSA"));
        return empList;
    }
}
class ContactListProxy implements IcontactList{
    private IcontactList contactList;
    @Override
    public List<Employees> getEmployeesList(){
        if(contactList == null){
            System.out.println("Fetching the list of employees \n");
            contactList = new ContactList();
        }
        return contactList.getEmployeesList();
    }
}
class Employees{
    private String empName;
    private double empSalary;
    private String empDesignation;
    //constructor of the list for initializing the class field.
    public Employees(String empName, double empSalary, String empDesignation){
        this.empName = empName;
        this.empSalary = empSalary;
        this.empDesignation = empDesignation;
    }
    public String getEmpDesignation(){
        return this.empName;
    }
    public double getEmpSalary(){
        return this.empSalary;
    }
    public String empDesignation(){
        return this.empDesignation;
    }
    @Override
    public String toString(){//overriding the toString method.
        String res = "Employee Name: " + empName + ", EmpDesignation : " + empDesignation + ", Employee Salary : " + empSalary;
        return res;
    }
}
public class LazyLoading {
    public static void main(String[] args) {
        //Instantiating the Contactlistproxy class.
        IcontactList contactListObj = new ContactListProxy();
        //Instantiating the company class 
        Company companyObj = new Company("Divine-it", "uttara-10", "01777111", contactListObj);
        System.out.println("Company name : " + companyObj.getCName());
        System.out.println("Company Address : " + companyObj.getCAddress());
        System.out.println("Company Contact: " + companyObj.getCContactNo());
        System.out.println("Requesting for the contact list : " + companyObj.getContactList());
        
        contactListObj = companyObj.getContactList();
        System.out.println("Your contact list object data : " + contactListObj.getEmployeesList());
        List<Employees> employeesList = contactListObj.getEmployeesList();
        //the list of employees data.
        for (Employees employee : employeesList) {
            System.out.println(employee);
        }
    }
}
