package Exercise4;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int distance = kb.nextInt();
        String type = kb.next();
        Logistics log;

        if (type.equalsIgnoreCase("Road")) {
            log = new RoadLogistics();
            double price = log.planDelivery(distance);

            System.out.printf("%.2f\n", price);
            log.deliver();
        } else if (type.equalsIgnoreCase("Sea")) {
            log = new SeaLogistics();
            double price = log.planDelivery(distance);
            
            System.out.printf("%.2f\n", price);
            log.deliver();

        }

    }
}