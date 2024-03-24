package Exercise2;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        ArrayList<PhoneNumber> listPN = new ArrayList<>();

        System.out.println("This program run util you key Q");
        while(true){
            System.out.print("Insert what do you want : ");
            String text = kb.nextLine();
            if(text.charAt(0) == 'a'){
                String[] token = text.split(" ");
                if(token.length == 3){
                    String command = token[0];
                    String name = token[1];
                    String phone = token[2];
                    listPN.add(new PhoneNumber(name, phone));
                }
                System.out.println(listPN.toString());
            } else if(text.charAt(0) == 's'){
                    String[] token = text.split(" ");
                    String command = token[0];
                    String name = token[1];
                    // หาว่าชื่อนั้นมีอยู่ในสมุดมั้ย คืนค่า boolean
                    boolean isFound = listPN.stream().anyMatch(lisp -> lisp.getName().equalsIgnoreCase(name));
                    // แสดงข้อมูล
                    if(isFound){
                        listPN.stream().filter(lisp -> lisp.getName().equalsIgnoreCase(name)).forEach(lisp -> System.out.println(lisp));
                    }else {
                        System.out.println("Not Found");
                    }
            } else if(text.charAt(0) == 'd'){
                    String[] token = text.split(" ");
                    String command = token[0];
                    String name = token[1];
                    // หาว่าชื่อนั้นมีอยู่ในสมุดมั้ย คืนค่า boolean
                    boolean isFound = listPN.stream().anyMatch(lisp -> lisp.getName().equalsIgnoreCase(name));
                    // แสดงข้อมูล
                    if(isFound){
                        System.out.print("Do you confirm to delete (Y/N) : ");
                        String yesORno = kb.nextLine();
                        if (yesORno.equalsIgnoreCase("Y")) {
                            listPN.removeIf(lisp -> lisp.getName().equalsIgnoreCase(name));
                        }else if(yesORno.equalsIgnoreCase("N")){
                            continue;
                        }
                    }else {
                        System.out.println(name + " not found in our phonebook");
                        System.out.println(listPN.toString());
                    }
            } else if(text.charAt(0) == 'Q'){
                    System.exit(0);
            }
        }
    }
}