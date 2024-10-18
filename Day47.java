package Coding100Hari;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner inputNilai = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = inputNilai.nextInt();
        
        if(nilai > 0){
            System.out.println("Benar");
        }
    }
    
}
