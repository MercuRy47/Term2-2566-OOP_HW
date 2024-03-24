package Dog_2;

public class Dog {
    public String name;
    public String breed;

    public void makeSound(){
        System.out.println("Boc Boc Boc");
    }

    Dog(){
        this.name = "unknow";
        this.breed = "unknow";
    }
    Dog(String n, String b){
        this.name = n;
        this.breed = b;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
}
