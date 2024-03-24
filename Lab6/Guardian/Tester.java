package Guardian;

public class Tester {
    public static void main(String[] args) {
        Person p1 = new Person("Jame", 1998);
        Person p2 = new Sheriff("Bank", 2000, "Mueang");
        Person p3 = new Police("Bell", 2001, "Chonburi");

        p1.Introduce();
        p2.Introduce();
        p3.Introduce();
    }
}
