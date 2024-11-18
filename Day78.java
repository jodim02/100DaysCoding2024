package project100dayscoding;
import java.util.Scanner;
public class Day78 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String passwordAsli = "jodim123";
        System.out.println("Masukkan Password : ");
        String password = input.nextLine();
        if(passwordAsli.equalsIgnoreCase(password)){
            System.out.println("Password Benar!");
        }else{
            System.out.println("Password Salah!");
        }
    }
}
