package Exercise1;

import java.util.*;

public class Tester{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // 1
        String name = kb.next();
        int age = kb.nextInt();
        
        Person person = new Person(name, age);
        System.out.println(person.getName());
        
        // 2
        name = kb.next();
        String howtouse = kb.next();

        Things things = new Things(name, howtouse);
        System.out.println(things.getName());

        // 3
        name = kb.next();
        String type = kb.next();

        Animal animal = new Animal(name, type);
        System.out.println(animal.getName());
    }
}