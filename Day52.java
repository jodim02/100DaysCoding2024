package project100dayscoding;
import java.util.Scanner;
public class Day52{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai UTS : ");
        int nilai = input.nextInt();
        int kkm = 70;
        String hasil = nilai >= kkm?"Tuntas":"Tidak Tuntas";
        System.out.println("Hasil : " + hasil);
    }
}
