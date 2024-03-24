package PointAndLine;
public class Line {
    public Point start;
    public Point end;

    public Line(){
        start = new Point(0, 0);
        end = new Point(0, 0);
    }
    public Line(Point start, Point end){
        this.start = start;
        this.end = end;
    }
    public Line(int xStart, int yStart, int xEnd, int yEnd){
        start = new Point(xStart, xEnd);
        end = new Point(yStart, yEnd);
    }

    public void setStartPoint(int x, int y){
        this.start = new Point(x, y);
    }
    public void setEndPoint(int x, int y){
        this.end = new Point(x, y);
    }

    public Point getStartPoint(){
        return start;
    }
    public Point getEndPoint(){
        return end;
    }

    public double distance(){
        return Math.sqrt(Math.pow((end.getX() - start.getX()), 2) + Math.pow((end.getY() - start.getY()), 2));
    }

    public String toString(){
        return "START = " + start.toString() + ", END = " + end.toString();
    }
}
