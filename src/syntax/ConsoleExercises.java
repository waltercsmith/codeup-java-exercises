
package syntax;

import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){
        //Copy this code into your main method: double pi = 3.14159;

    double pi = 3.14159;

        //Write some Java code that uses the variable pi to output the following:
        //The value of pi is approximately 3.14.

        double shortValueOfPI = 3.14;

        //Created a double data type with a value of 3.14


        //System.out.printf("The value of pi is approximately: " + shortValueOfPI);
        System.out.printf("The value of pi is approximately: %.2f%n", pi);

        /*Prompt a user to enter a integer and store that value in an int variable using the
        nextInt method.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        Integer userInt = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInt + "\" <--");

        /*When you input something that is not an integer then the console
        displays an "Exception in thread" message
         */


    }

}
