package Exercise1;

public class Things implements Nameable{
    private String name;
    private String howToUse;

    public Things(String name, String howToUse){
        this.name = name;
        this.howToUse = howToUse;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }
}
