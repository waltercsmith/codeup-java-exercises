package shapes;



public class Rectangle {

    protected double rectangleLength;
    protected double rectangleWidth;


    public Rectangle(double length, double width) {
        this.rectangleLength = length;
        this.rectangleWidth = width;
    }

    public static double getArea(double length, double width){
        return length * width;
    }

    public static double getPerimeter(double length, double width){
        return (2 * length) + (2 * width);
    }


}

//   public class Rectangle extends Quadrilateral implements Measurable {
//
//        public Rectangle(double length, double width) {
//            this.width = width;
//            this.length = length;
//        }
//
//        @Override
//        public double getPerimeter() {
//            return 2 * (length + width);
//        }
//
//        @Override
//        public double getArea() {
//            return length * width;
//        }
//
//        @Override
//        void setLength(double length) {
//            this.length = length;
//        }
//
//        @Override
//        void setWidth(double width) {
//            this.width = width;
//        }
//
//
//}
