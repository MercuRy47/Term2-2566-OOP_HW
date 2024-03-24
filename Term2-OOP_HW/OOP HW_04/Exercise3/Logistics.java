package Exercise3;

public class Logistics {
    private Transport transport;
    private double distance = 0;

    public double planDelivery(Transport transport, int distance){
        return transport.getRate() * distance;
    }

    public void deliver(){
        transport.deliver();
    }
}
