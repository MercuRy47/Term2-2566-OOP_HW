package Guardian;

public class Police extends Person{
    String workCountry;
    
    // Constructor
    public Police(){
        workCountry = "unknow";
    }
    public Police(String name, int bornYear, String workCountry){
        this.name = name;
        this.bornYear = bornYear;
        this.workCountry = workCountry;
    }
    
    // Other
    public void Introduce(){
        System.out.println("My name is " + name);
        System.out.println("I was born in " + bornYear);
        System.out.println("I'm a police and work in " + workCountry);
    }
}
