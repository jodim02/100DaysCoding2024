package project100dayscoding;
import java.util.Scanner;
public class SOAL_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Input Data Anggota
        System.out.print("Masukkan Nama : ");
        String nama = in.nextLine();
        System.out.print("Masukkan Umur : ");
        int umur = in.nextInt();
        System.out.print("Status Keanggotaan(true/false) : ");
        boolean status = in.nextBoolean();
        String keanggotaan = status ? "Member" : "Non-member";
        
        System.out.println("-------------------------------------");
        // Menampilkan Data
        System.out.printf("Nama : %s\n", nama);
        System.out.printf("Umur : %d thn\n", umur);
        System.out.printf("Status Keanggotaan : %s\n",keanggotaan);
        
        if(umur > 18){
            System.out.println("Selamat, Anda memenuhi syarat untuk keanggotaan premium.");
        }else{
            System.out.println("Maaf, Anda belum memenuhi syarat untuk keanggotaan premium.");
        }  
    }
}
