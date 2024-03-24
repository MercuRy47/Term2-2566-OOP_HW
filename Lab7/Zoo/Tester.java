package Zoo;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String type, name;
        int count = kb.nextInt();
        String[] message = new String[count];
        
        for(int i = 0; i < count; i++){
            type = kb.next();
            name = kb.next();
            
            Poultry p = new Poultry(name);
            Fish f = new Fish(name);

            if(type.equalsIgnoreCase("Duck")){
                Duck duck = new Duck();
                message[i] = p.toString() + duck.toString();
            }else if(type.equalsIgnoreCase("Chicken")){
                Chicken chicken = new Chicken();
                message[i] = p.toString() + chicken.toString();
            }else if(type.equalsIgnoreCase("Parry")){
                Parry parry = new Parry();
                message[i] = p.toString() + parry.toString();
            }
    
            if(type.equalsIgnoreCase("Dolphin")){
                Dolphin dolphin = new Dolphin();
                message[i] = f.toString() + dolphin.toString();
            }else if(type.equalsIgnoreCase("Ray")){
                Ray ray = new Ray();
                message[i] = f.toString() + ray.toString();
            }else if(type.equalsIgnoreCase("Shark")){
                Shark shark = new Shark();
                message[i] = f.toString() + shark.toString();
            }
        }
        
        for (String printMessage : message) {
            System.out.println(printMessage);
        }
        System.out.println("The number of Poultry = " + Poultry.totalPoultryVisits);
        System.out.println("The number of Fish = " + Fish.totalFishVisits);
    }
}