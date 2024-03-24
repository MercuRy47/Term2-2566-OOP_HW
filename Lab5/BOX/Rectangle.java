package BOX;

public class Rectangle {
    protected double length;
    protected double width;

    // Constructor
    public Rectangle(){
        length = 0;
        width = 0;
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    // SET
    public void setDimension(double length, double width){
        this.length = length;
        this.width = width;
    }

    // GET
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    // Other
    public double area(){
        return width * length;
    }
    public double surface(){
        return (2 * width) + (2 * length);
    }

    public String toString(){
        return "Rectangel: width = " + width + " length = " + length;
    }
}
