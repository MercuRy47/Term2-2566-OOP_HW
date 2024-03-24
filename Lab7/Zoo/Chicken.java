package Zoo;

public class Chicken extends Poultry{
    
    // Constructor
    public Chicken(){
        Poultry.totalPoultryVisits++;
    }
    public Chicken(String name){
        this.name = name;
    }

    // Other
    public String toString(){
        return "I like " + move() + ". I eat " + eat();
    }

    public String move(){
        return "walking";
    }

    public String eat(){
        return "worm";
    }
}
