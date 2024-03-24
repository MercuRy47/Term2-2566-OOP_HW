public class Employee extends Person{
    protected int salary;
    protected String position;

    // Constructor
    public Employee(){
        salary = 0;
        position = "unknow";
    }
    // Constructor
    public Employee(String firstname, String lastname, int salary, String position){
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.position = position;
    }

    // SET
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setPosition(String position){
        this.position = position;
    }

    // GET
    public int getSalary(){
        return salary;
    }
    public String getPosition(){
        return position;
    }

    // Other
    public int calculatePay(){
        return salary;
    }
    public void upSalary(int percent){
        this.salary += (percent / 100.0 ) * salary;
    }

    public String toString(){
        return "Employee : " + firstname + " " + lastname + " " + position + " " + salary;
    }
}
