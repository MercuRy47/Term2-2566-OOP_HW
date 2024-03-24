package Work;
public class Employee {
    String name;
    double salary;

    // Constructor
    public Employee(){
        name = "unknow";
        salary = 0;
    }
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    // Other
    public double calSalary(){
        return 0;
    }

    public String toString(){
        return "My name is " + name + ". I am an employee. \nMy salary is " + salary +"\n";
    }
}
