package Work;
import java.util.Scanner;

public class Tester2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        
        System.out.print("Enter number of person : ");
        int count = kb.nextInt();

        Employee[] list = new Employee[count];
        int count1 = 1;
        int count2 = 1;
        int count3 = 1;
        int count4 = 1;

        for(int i = 0; i < count; i++){
            System.out.printf("Enter information of person (%s) :\n", i+1);
            System.out.print("Enter type of person : ");
            int type = kb.nextInt();

            if(type == 1){
                System.out.printf("Enter Employee information (%s) [name salary] : ", count1);
                String name = kb.next();
                double salary = kb.nextDouble();
                Employee employee = new Employee(name, salary);
                list[i] = employee;
                count1++;

            }else if(type == 2){
                System.out.printf("Enter Sale information (%s) [name salary commission] : ", count2);
                String name = kb.next();
                double salary = kb.nextDouble();
                double commission = kb.nextDouble();
                Sales sale = new Sales(name, salary, commission);
                list[i] = sale;
                count2++;

            }else if(type == 3){
                System.out.printf("Enter Manager information (%s) [name salary parkNo] : ", count3);
                String name = kb.next();
                double salary = kb.nextDouble();
                String parkNo = kb.next();
                Manager manager = new Manager(name, salary, parkNo);
                list[i] = manager;
                count3++;

            }else if(type == 4){
                System.out.printf("Enter Programmer information (%s) [name salary OT] : ", count4);
                String name = kb.next();
                double salary = kb.nextDouble();
                int OT = kb.nextInt();
                Programmer programmer = new Programmer(name, salary, OT);

                System.out.print("Enter number of programming language : ");
                int skill = kb.nextInt();
                String[] progSkill = new String[skill];
                for(int s = 0; s < skill; s++){

                    System.out.printf("Enter name of lang (%s) : ", s+1);
                    String lang = kb.next();
                    progSkill[s] = lang;

                }
                programmer = new Programmer(name, salary, progSkill, OT);
                list[i] = programmer;
                count4++;

            }
        }
        System.out.println("<=== The detail of each person ===>");
        for (Employee printList : list) {
            System.out.printf(printList.toString());
        }
    }
}
