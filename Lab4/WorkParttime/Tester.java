package WorkParttime;

public class Tester {
    public static void main(String[] args) {
        Employee john = new Employee("John", "Smith", 23500.0);
        john.showInfo();

        System.out.println("===============");

        ParttimeEmployee tony = new ParttimeEmployee("Tony", "Stark", 8);
        tony.showInfo();
    }
}
