package project100dayscoding;
import java.util.Scanner;
public class Day97 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Batas nilai : ");
        int n = in.nextInt();
        System.out.println("Bilangan prima antara 1 sampai "+ n + " adalah :");
        
        for(int a=2; a<=n; a++){
            if(isPrima(a)){
                System.out.print(a+" ");
            }
        }
        System.out.println(" ");
    }
    public static boolean isPrima(int angka){
        if(angka < 2){
            return false;
        }
        for(int a=2; a<=Math.sqrt(angka); a++){
            if(angka % a == 0){
                return false;
            }
        }
        return true;
    }
}
