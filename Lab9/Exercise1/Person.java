package Exercise1;

public class Person implements Nameable{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }
}
