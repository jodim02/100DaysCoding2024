package project100dayscoding;
import java.util.Scanner;
public class Day91 {
    public static void main(String[] args) {
        // You and I, End
        Scanner in = new Scanner(System.in);
        System.out.print("Pilihan(You/I) : ");
        String input = in.nextLine();

        if(input.equalsIgnoreCase("you")){
            System.out.println("You are coming");
            System.out.println("End.");
        }else if(input.equalsIgnoreCase("i")){
            System.out.println("I am coming");
            System.out.println("End.");
        }else{
            System.out.println("Pilihan tidak valid");
            System.out.println("End.");
        }
    }
}
