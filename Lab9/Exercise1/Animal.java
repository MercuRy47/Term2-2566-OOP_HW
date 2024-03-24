package Exercise1;

public class Animal implements Nameable{
    private String name;
    private String type;

    public Animal(String name, String type){
        this.name = name;
        this.type = type;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }
}
