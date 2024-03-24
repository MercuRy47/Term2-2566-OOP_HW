package CuteAnimal;

public class Pet{
    private String name;
    private double weight;

    public Pet(){
        name = "unknow";
        weight = 0;
    }
    public void setPet(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public void showInfo(){
        System.out.println("Name: " + name);
        System.out.printf("Weight: %.1f\n", weight);
    }
    public void eat(){
        weight += 0.1;
        System.out.printf("Weight: %.1f\n", weight);
    }
}