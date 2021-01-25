package syntax;

import com.sun.source.tree.WhileLoopTree;

public class ControlFlowExercises {
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
            int i = 0;
        int x = i *2;
            do {

                System.out.println(i * 2);
                i++;
            }
            while ( i <= 50);

            //Realized that if I an multiplication of 2 within the do statment within the println that I could
            //multiple each increment by 2 and make sure that the while condition was less than or equal to 50

            //Do not delete the i++ because only 0 will print out endlessly

            //The above code will print all the numbers 0 to 101

            //The above code does not work! It only prints "You will see this despite the condition!
                }
            }


