package project100dayscoding;
import java.util.*;
public class Day95 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah baris & kolom : ");
        int n = in.nextInt();
        System.out.println("");
        System.out.println("Segitiga siku-siku");
        for(int a=1; a<=n; a++){
            for(int b=1; b<=a; b++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        
        System.out.println("Segitiga siku-siku terbalik");
        for(int x=n; x>=1; x--){
            for(int y=1; y<=x; y++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
