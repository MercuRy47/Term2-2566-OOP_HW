package Zoo;

public class Fish extends Animal{
    public static int totalFishVisits = 0; 

    private String my_type = "Fish";

    // Constructor
    public Fish(){
        o.setType("fin");
    }
    public Fish(String name){
        this.name = name;
        o.setType("fin");
    }

    // Other
    public String toString(){
        return "Hello, my name is " + name + ". I am a Fish.I have " + o.getType() + ". ";
    }
}
