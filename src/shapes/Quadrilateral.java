package shapes;

public class Quadrilateral extends Shape {
    protected double length;
    protected double width;

    public Quadrilateral() {

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

    }

    Quadrilateral (double length, double width) {
        this.length = length;
        this.width = width;
    }
}
