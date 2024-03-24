package Work;
public class Sales extends Employee{
    double commission;

    // Constructor
    public Sales(){
        commission = 0;
    }
    public Sales(String name, double salary, double commission){
        this.name = name;
        this.salary = salary;
        this.commission = commission;
    }

    // Other
    public double calSalary(){
        return salary + commission;
    }

    public String toString(){
        return "My name is " + name + ". I am an sales. \nMy salary is " + calSalary() +"\n";
    }
}