package Work;
public class Manager extends Employee{
    String parkingNo;

    // Constructor
    public Manager(){
        parkingNo = "unknow";
    }
    public Manager(String name, double salary, String parkingNo){
        this.name = name;
        this.salary = salary;
        this.parkingNo = parkingNo;
    }

    // Other
    public double calSalary(){
        return salary;
    }

    public String toString(){
        return "My name is " + name + ". I am an manager. \nMy salary is " + salary +"\n";
    }
}
