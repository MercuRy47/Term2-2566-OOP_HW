package Zoo;

public class Animal{
    protected String name;
    protected Organ o;

    // Constructor
    public Animal(){
        name = "unknow";
        o = new Organ();
        o.setType("unknow");
    }
    public Animal(Organ o, String name){
        this.o = o;
        this.name = name;
    }

    // Other
    public String toString(){
        return "Hello, my name is " + name + ".";
    }
} 