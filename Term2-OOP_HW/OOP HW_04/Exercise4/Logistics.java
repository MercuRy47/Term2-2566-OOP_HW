package Exercise4;

public abstract class Logistics {
    private Transport transport;
    private double distance = 0;

    public double planDelivery(int distance){
        transport = createTransport();
        return transport.getRate() * distance;
    }

    public void deliver(){
        transport.deliver();
    }

    public abstract Transport createTransport();
}