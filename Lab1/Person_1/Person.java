package Person_1;

public class Person {
    public String name;
    public double weight;
    public double height;

    public double bmi(){
        return weight / Math.pow(height, 2);
    }

    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }
    public double getHeight(){
        return height;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setHeight(double height){
        this.height = height;
    }
}
