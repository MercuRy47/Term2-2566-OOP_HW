package Exercise4;

public class RoadLogistics extends Logistics{
    
    public Transport createTransport(){
        return new Truck();
    }
}
