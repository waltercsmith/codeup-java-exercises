package shapes;

public class Circle {
    private double radius;


    double pi =Math.PI;

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){

        return  pi * (this.radius * radius);

    }
    public double getCircumference(){
        return   2 * pi * radius;
    }

}


