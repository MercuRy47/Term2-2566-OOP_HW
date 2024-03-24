package BOX;

public class Box extends Rectangle{
    protected double depth;

    // Constructor
    public Box(){
        length = 0;
        width = 0;
        depth = 0;
    }
    public Box(double length, double width, double depth){
        this.length = length;
        this.width = width;
        this.depth = depth;

    }

    // SET
    public void setDimension(double length, double width, double depth){
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    // GET
    public double getDepth(){
        return depth;
    }

    // Other
    public double volumn(){
        return width * length * depth;
    }
    public double surface(){
        return (2 * width * length) + (2 * length * depth) + (2 * width * depth);
    }
    
    public String toString(){
        return "Box: width = " + width + " length = " + length + " depth = " + depth;
    }
}
