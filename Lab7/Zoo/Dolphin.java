package Zoo;

public class Dolphin extends Fish{
    
    // Constructor
    public Dolphin(){
        Fish.totalFishVisits++;
    }
    public Dolphin(String name){
        this.name = name;
    }

    // Other
    public String toString(){
        return "I like " + move() + ". I eat " + eat();
    }

    public String move(){
        return "hover swimming";
    }

    public String eat(){
        return "seaweed";
    }
}
