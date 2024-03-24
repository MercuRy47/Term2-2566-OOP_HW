package JameAndBell;
public class Employee {
    protected String empName;
    protected String empNumber;
    protected String hireDate;

    // Constructor
    public Employee(){
        empName = "unknow";
        empNumber = "000-0";
        hireDate = "00-00-0000";
    }
    public Employee(String empName, String empNumber, String hireDate){
        this.empName = empName;
        this.empNumber = empNumber;
        this.hireDate = hireDate;
    }

    // GET
    public String getName(){
        return empName;
    }

    // SET


    // Other
    public void showInfo(){
        System.out.println("Name : " + empName);
        System.out.println("Number : " + empNumber);
        System.out.println("Date : " + hireDate);
    }
}
