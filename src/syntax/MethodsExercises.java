package syntax;
import java.util.Scanner;
public class MethodsExercises {
    //Create four separate methods. Each will perform an arithmetic operation:
    //Addition
    public static int addNumbers(int addend1, int addend2){
            return addend1 + addend2;
    }

    //Substraction
    public static int subtractNumbers(int minuend, int subtrahend){
            return minuend - subtrahend;
    }

    //Multiplication
    public static int multiplyNumbers(int factor1, int factor2){
            return factor1 * factor2;
    }

    //Division
    public  static int divideNumbers( int dividend, int divisor){
            return dividend / divisor;
    }

    //Modulus method that finds the modulus of two numbers
    public static int modulusOfNumbers(int num1, int num2){
            return num1 % num2;
    }

    //Create a method that validates that user input is in a certain range
    public static int getInteger(int min, int max){
        Scanner input = new Scanner(System.in);
        Integer userInput = input.nextInt();


            if(userInput >= min & userInput <= max ){
                System.out.println("All done");
            }

            return userInput;

    }

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 & 10, please.");
        String userInput = input.nextLine();
        System.out.println("You entered the number: " + userInput);
        int range = MethodsExercises.getInteger(1,10);
        System.out.println(range + " is within the number range");


        //Test your methods and verify the output
//        int sum = MethodsExercises.addNumbers(2,2);
//        System.out.println("2 + 2 = " + sum);
//        int difference = MethodsExercises.subtractNumbers(9,3);
//        System.out.println("9 - 3 = " + difference);
//        int product = MethodsExercises.multiplyNumbers(2,3);
//        System.out.println("2 x 3 = " + product);
//        int quotient = MethodsExercises.divideNumbers(12,6);
//        System.out.println("12 / 6 = " + quotient);
//        int modulus = MethodsExercises.modulusOfNumbers(10,3);
//        System.out.println("The remainder of 10 divided by 3 is: " + modulus);

//        //Create a method that validates that user input is in a certain range
//        public static int getInteger(int min, int max){
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter a number between 1 & 10, please.");
//            int userInput = input.nextInt();
//
//            if(userInput >= min & userInput <= max ){
//                System.out.println("All done");
//            }
//
//            return userInput;



//
//        }

    }
}
