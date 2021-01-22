
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
//        System.out.printf("The value of pi is approximately: %.2f%n", pi);

        /*Prompt a user to enter a integer and store that value in an int variable using the
        nextInt method.*/

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter something: ");
//        Integer userInt = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInt + "\" <--");

        /*When you input something that is not an integer then the console
        displays an "Exception in thread" message
         */

        /*Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the        console, each on a newline.*/

//        System.out.println("Enter 3 words");
//        String word1 = scanner.nextLine();
//        String word2 = scanner.nextLine();
//        String word3 = scanner.nextLine();
//        System.out.println("Here are the three words: --> \"" + word1 + "\" <--");
//        System.out.println("Here are the three words: --> \"" + word2 + "\" <--");
//        System.out.println("Here are the three words: --> \"" + word3 + "\" <--");
        //Entering less than three words will result in an empty quote

        //Prompt a user to enter a sentence,
//        System.out.println("Enter a sentence");

        //Then store that sentence in a String variable using the next method
//        String userSentence = scanner.next();

        //Then, display that sentence back to the user
//        System.out.println(userSentence);
        //The console does not capture all the words

        //Rewrite the above example using the nextLine method
//        String revisedUserSentence = scanner.nextLine();
//        System.out.println(revisedUserSentence);


        //Prompt the user to enter values of length and width of a classroom at Codeup
        System.out.println("Enter the length and width of a classroom");

        //Use the nextLine method to get user input and parse the resulting string to a numeric type.
        String userLengthString = scanner.nextLine();
        String userWidthString = scanner.nextLine();
        double userLengthDouble = Double.parseDouble(userLengthString);
        double userWidthDouble = Double.parseDouble(userWidthString);
        System.out.printf("The length is: "+ userLengthDouble + "%n" +"The width is: " + userWidthDouble);

    }

}
