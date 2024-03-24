package Work;
public class Tester{
    public static void main(String[] args) {
        Employee em = new Employee();

        Employee[] emList = new Employee[5];
        Sales s1 = new Sales("Jame", 15000, 5000);
        emList[0] = s1;
        Sales s2 = new Sales("Bell", 20000, 8000);
        emList[1] = s2;

        Manager m1 = new Manager("Peter", 40000, "40-19");
        emList[2] = m1;

        String[] p1Skill = {"Java", "C"};
        Programmer p1 = new Programmer("Ann", 30000, p1Skill, 10000);
        emList[3] = p1;
        String[] p2Skill = {"Java", "PHP", "Python"};
        Programmer p2 = new Programmer("Bank", 40000, p2Skill, 8000);
        emList[4] = p2;

        for (Employee printList : emList) {
            System.out.printf(printList.toString());
        }
    }
}