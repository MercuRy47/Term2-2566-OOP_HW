package Zoo;

public class Shark extends Fish{
    
    // Constructor
    public Shark(){
        Fish.totalFishVisits++;
    }
    public Shark(String name){
        this.name = name;
    }

    // Other
    public String toString(){
        return "I like " + move() + ". I eat " + eat();
    }

    public String move(){
        return "straight swimming";
    }

    public String eat(){
        return "smallfish";
    }
}
