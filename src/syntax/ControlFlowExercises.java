package syntax;

import com.sun.source.tree.WhileLoopTree;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //Loop Basic:
        //While
        //Create an integer variable i with a value of 5
        int i = 5;

        //Create a while loop that runs so long as i is less than or equal to 15
        while(i <= 15){
            System.out.println("i is " + i);
            i++;

        }
    }
}
