package Zoo;

public class Parry extends Poultry{
    
    // Constructor
    public Parry(){
        Poultry.totalPoultryVisits++;
    }
    public Parry(String name){
        this.name = name;
    }

    // Other
    public String toString(){
        return "I like " + move() + ". I eat " + eat();
    }

    public String move(){
        return "speaking";
    }

    public String eat(){
        return "bean";
    }
}
