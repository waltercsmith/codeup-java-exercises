package syntax;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        System.out.println("Ask Bob a question, please");


        Scanner sc = new Scanner(System.in);
    String question = sc.nextLine();


    /*If the variable question contains a question mark at the end of the string
    then the console will print Bob's reply: "Sure"*/
    if (question.endsWith("?")){
        System.out.println("Bob's reply: \"Sure\"");
    }


    }
}
