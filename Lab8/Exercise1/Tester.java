package Exercise1;

import java.util.*;

public class Tester{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        ArrayList<Student> listStudent = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            int id = kb.nextInt();
            String name = kb.next();
            double gpa = kb.nextDouble();
            listStudent.add(new Student(id, name, gpa));
        }

        listStudent.forEach(lisStu -> System.out.printf("%s (%s) %s\n", lisStu.getName(), lisStu.getType(), lisStu.checkStatus()));
    }
}