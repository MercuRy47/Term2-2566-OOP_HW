package Exercise2;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Logistics logistics = new Logistics();
        Truck truck = new Truck();

        int distance = kb.nextInt();

        System.out.printf("%.2f\n", logistics.planDelivery(truck, distance));
        truck.deliver();
    } 
}