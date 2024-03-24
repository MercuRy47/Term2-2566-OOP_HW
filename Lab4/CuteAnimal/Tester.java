package CuteAnimal;

public class Tester {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("=====CAT=====");
        cat.setPet("Som", 2.2);
        cat.showInfo();
        cat.eat();
        
        Dog dog = new Dog();
        System.out.println("=====DOG=====");
        dog.setPet("Black", 3.4);
        dog.showInfo();
        dog.eat();
        dog.eat();
    }
}
