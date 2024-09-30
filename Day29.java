package Coding100Hari;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger angka1 = new BigInteger("12345");
        BigInteger angka2 = new BigInteger("6789");

        BigInteger hasilTambah = angka1.add(angka2);
        System.out.println("Hasil Penjumlahan: " + hasilTambah);
    }
}
