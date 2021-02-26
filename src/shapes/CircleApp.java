package shapes;

import util.Input;
import java.util.Scanner;

public class CircleApp {

    public double getDouble () {
        double number;

//        try{ number=Double.valueOf(getString());
//            System.out.printf("please enter a double: %n");
//            return number;
//        }catch (NumberFormatException e){
//            System.err.println("array out of bounds");;
//            return getDouble();
//
//        }

    }
    public static void main(String[] args) {


        Input input=new Input();
//        double radius = input.getDouble();


        Circle circle = new Circle(radius);

        System.out.println("The Area is : " + circle.getArea());
        System.out.println("The Circumference is : " + circle.getCircumference());

    }

    }

