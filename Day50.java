package project100dayscoding;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();
        if (nilai >= 95){
            System.out.println("Nilai A");
        }else if(nilai >= 80 && nilai < 95){
            System.out.println("Nilai B");
        }else if(nilai >= 60 && nilai < 80){
            System.out.println("Nilai C");
        }else{
            System.out.println("Nilai tidak memenuhi standar");
        }
        
    }
    
}
