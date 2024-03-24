package Zoo;

public class Ray extends Fish{
    
    // Constructor
    public Ray(){
        Fish.totalFishVisits++;
    }
    public Ray(String name){
        this.name = name;
    }

    // Other
    public String toString(){
        return "I like " + move() + ". I eat " + eat();
    }

    public String move(){
        return "circulate swimming";
    }

    public String eat(){
        return "plankton";
    }
}
