package Exercise2;

public class Logistics {
    private Truck truck;
    private double distance = 0;

    public double planDelivery(Truck truck, int distance){
        return truck.getRate() * distance;
    }

    public void deliver(){
        truck.deliver();
    }
}
