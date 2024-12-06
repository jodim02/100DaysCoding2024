package project100dayscoding;
import java.util.Scanner;
public class Day96 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Jumlah baris : ");
        int n = in.nextInt();

        // Sisi atas
        for(int a=1; a<=n; a++){
            for(int b=1; b<=n-a; b++){
                System.out.print(" ");
            }
            for(int c=1; c<=a*2-1; c++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Sisi bawah
        for(int x=n-1; x>=1; x--){
            for(int y=1; y<=n-x; y++){
                System.out.print(" ");
            }
            for(int z=1; z<=x*2-1; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
