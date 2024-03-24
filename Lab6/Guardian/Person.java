package Guardian;

public class Person {
    String name;
    int bornYear;

    // Constructor
    public Person(){
        name = "unknow";
        bornYear = 0;
    }
    public Person(String name, int bornYear){
        this.name = name;
        this.bornYear = bornYear;
    }

    // Other
    public void Introduce(){
        System.out.println("My name is " + name);
        System.out.println("I was born in " + bornYear);
    }
}
