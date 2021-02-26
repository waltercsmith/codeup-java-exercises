package shapes;

public class Square extends Quadrilateral implements Measurable {


    public Square(double length, double width) {
        super(length, width);
    }

    public Square(double side) {

    }

    public Square() {
        super();
    }

    @Override
    public double getPerimeter() {
        return this.length*4;
    }
    @Override
    public double getArea() {
        return Math.pow(this.length, 2);
    }

//    Square (double lengthSide) {
//
//        super(lengthSide,lengthSide);
//    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }


    public static void main(String[] args) {



    }
}
