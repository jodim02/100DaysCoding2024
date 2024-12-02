package project100dayscoding;
import java.util.Scanner;
public class Day92 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah baris : ");
        int n = in.nextInt();
        System.out.println(" ");
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                
                if (j == i || j == (2 * n - 2 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

