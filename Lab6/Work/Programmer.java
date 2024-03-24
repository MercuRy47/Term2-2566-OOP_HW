package Work;
public class Programmer extends Employee{
    String[] progSkills;
    int OT;

    // Constructor
    public Programmer(){
        progSkills = null;
        OT = 0;
    }
    public Programmer(String name, double salary, String[] progSkills, int OT){
        this.name = name;
        this.salary = salary;
        this.progSkills = progSkills;
        this.OT = OT;
    }
    public Programmer(String name, double salary, int OT){
        this.name = name;
        this.salary = salary;
        this.OT = OT;
    }

    // Other
    public double calSalary(){
        return salary + OT;
    }

    public String showSkills(){
        String all = String.join(", ", progSkills);
        return all;
    }

    public String toString(){
        return "My name is " + name + ". I am an programmer." + "\nMy programer skill are : " + showSkills() + "\nMy salary is " + calSalary() +"\n";
    }
}
