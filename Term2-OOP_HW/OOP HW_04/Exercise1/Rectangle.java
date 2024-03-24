package Exercise1;

public class Rectangle extends Shape{
    private double width;
    private double lenght;

    public Rectangle(double width, double lenght){
        this.width = width;
        this.lenght = lenght;
    }

    public double area(){
        return width * lenght;
    }
}
