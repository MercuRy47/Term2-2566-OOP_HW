package WorkParttime;

public class Employee extends Person{
    protected double salary;

    public Employee(){
        salary = 0;
    }
    
    public Employee(String fname, String lname, double salary){
        super.setPerson(fname, lname);
        this.salary = salary;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Salary: " + salary + " Bath");
    }
}