package project100dayscoding;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jenis Kelamin (L/P) : ");
        String jeniskelamin = input.nextLine();
        
        switch(jeniskelamin){
            case "L":
            System.out.println("Laki-laki");
            break;
            case "P":
            System.out.println("Perempuan");
            default:
            System.out.println("Inputan salah!");
        }
    }
    
}
