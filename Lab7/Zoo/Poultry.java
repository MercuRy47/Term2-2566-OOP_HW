package Zoo;

public class Poultry extends Animal{
    public static int totalPoultryVisits = 0; 

    private String my_type = "Poultry";

    // Constructor
    public Poultry(){
        o.setType("wing");
    }
    public Poultry(String name){
        this.name = name;
        o.setType("wing");
    }

    // Other
    public String toString(){
        return "Hello, my name is " + name + ". I am a Poultry.I have " + o.getType() + ". ";
    }
}