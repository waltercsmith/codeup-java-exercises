package grades;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();


        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println();
        System.out.println(students.values());
        System.out.println();
        String seeInfo = "What student would you like to see more information on?";
        System.out.println(seeInfo);
        System.out.println();
        System.out.println(students.keySet());
        Scanner scan = new Scanner(System.in);
        String userChoice = scan.nextLine().toLowerCase();

        switch (userChoice) {
            case "edith":
                System.out.println("Name: Edith - User name: XedithX14");


                break;
            case "quan":
                System.out.println("Name: Quan - User name: XquanX11");
                break;
            case "chrissette":
                System.out.println("Name: Chrissette - User name: XchrissetteX13");
                break;
            case "braden":
                System.out.println("Name: Braden - User name: XbradenX12");
                break;
            default:
                System.out.println("Your selection was invalid");
                break;
        }
    }
}
