package syntax;

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
    public static void main(String [] args){

        //Test your methods and verify the output
        int sum = MethodsExercises.addNumbers(2,2);
        System.out.println("2 + 2 = " + sum);
        int difference = MethodsExercises.subtractNumbers(9,3);
        System.out.println("9 - 3 = " + difference);
        int product = MethodsExercises.multiplyNumbers(2,3);
        System.out.println("2 x 3 = " + product);
        int quotient = MethodsExercises.divideNumbers(12,6);
        System.out.println("12 / 6 = " + quotient);
        int modulus = MethodsExercises.modulusOfNumbers(10,3);
        System.out.println("The remainder of 10 divided by 3 is: " + modulus);
    }
}
