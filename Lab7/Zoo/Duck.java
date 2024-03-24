package Zoo;

public class Duck extends Poultry{
    
    // Constructor
    public Duck(){
        Poultry.totalPoultryVisits++;
    }
    public Duck(String name){
        this.name = name;
    }

    // Other
    public String toString(){
        return "I like " + move() + ". I eat " + eat();
    }

    public String move(){
        return "swimming";
    }

    public String eat(){
        return "rice";
    }
}
