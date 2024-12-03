package project100dayscoding;
import java.util.Scanner;
public class Day93 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Jumlah baris : ");
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j == n - 1 - i || j == n - 1 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }   
}
