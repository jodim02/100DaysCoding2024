package project100dayscoding;

import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Umur : ");
        int umur = input.nextInt();
        
        if(umur < 13){
            System.out.println("Anak-anak");
        }else if(umur >=13 && umur<=19){
            System.out.println("Remaja");
        }else if(umur >= 20){
            System.out.println("Dewasa");
        }
    }
}
