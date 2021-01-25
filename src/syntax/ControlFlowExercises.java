package syntax;

import com.sun.source.tree.WhileLoopTree;

public class ControlFlowExercises {
    private int x;

    public static void main(String[] args) {

        //Loop Basic:
        //While
        //Create an integer variable i with a value of 5
        //int i = 5;

        //Create a while loop that runs so long as i is less than or equal to 15
//        while(i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }


        //Do While
        /* Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a             new line*/
//        int i = 0;
//        do {
//
//            System.out.println(i * 2);
//            i++;
//        }
//        while (i <= 50);

        //Realized that if I an multiplication of 2 within the do statment within the println that I could
        //multiple each increment by 2 and make sure that the while condition was less than or equal to 50

        //Do not delete the i++ because only 0 will print out endlessly

        //Alter your loop to count backwards by 5's from 100 to -10

//        int i = 20;
//        do {
//
//            System.out.println(i * 5);
//            i--;
//        }
//        while (i >= -2);


        /*I noticed that line 40 is the starting point for i. Line 43 will loop i each time and multiple by
        5. Line 44 is a post decrement which mean that i will decrease by 1 each time it loops.
        Line 46 is the while condition where the loop will continue as long as the condition is true
         */

        /*Create a do-while loop that starts at 2, and displays the number squared on each line
        while the number is less than 1,000,000
         */
        int i = 1;
        do {
            System.out.println(i * 2 );
            i++;
        }
        while (i <= 16);

        //I get the ending number of 65536 but not just five lines of numbers




    }

}


