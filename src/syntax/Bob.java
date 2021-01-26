package syntax;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
//        System.out.println("Ask Bob a question, please");


        Scanner sc = new Scanner(System.in);
    String question = sc.nextLine();


    /*If the variable question contains a question mark at the end of the string
    then the console will print Bob's reply: "Sure"*/
//    if (question.endsWith("?")){
//        System.out.println("Bob's reply: \"Sure\"");


     /*If the variable question contains an exclamation mark at the end of the string
    then the console will print Bob's reply: "Whoa, chill out!' if you yell at him"*/

//    }else if (question.endsWith("!")){
//        System.out.println("Bob's reply: \"Whoa, chill out!\"");
//    }else if (question.endsWith("")){
//        System.out.println("Bob's reply: \"Whatever\"");
//    }
//    else {
//        System.out.println("Whatever");
//    }

//        int x = 5;
//                System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);

//        int x = 5 * 4 % 3;
//        System.out.println(x);
        String string = "Hey";
        System.out.println(string   + 6);
    }
}
