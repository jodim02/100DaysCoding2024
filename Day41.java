package Evaluasi_2;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Scanner;

public class Day41 {
     public static void main(String[] args){
        Scanner soal = new Scanner(System.in);
        
        // Tipe Data Reference Boolean
        int A,B;
        Boolean C;
         System.out.println("Tipe Data Reference Boolean");
         System.out.print("Masukkan Nilai A :");
         A = soal.nextInt();
         System.out.print("Masukkan Nilai B :");
         B = soal.nextInt();
         C = A > B;
         System.out.println("Nilai A > B : " + C);        
        
         System.out.print("\n");
        
        // BigInteger & BigDecimal
         System.out.println("Tipe Data Reference BigInteger & BigDecimal");
         System.out.print("Masukkan Nilai BigInteger : ");
         BigInteger nilai1 = soal.nextBigInteger();
         System.out.print("masukkan Nilai BigDecimal : ");
         BigDecimal nilai2 = soal.nextBigDecimal();
                             
         System.out.print("\n");
        
        // Konversi String ke Tipe Data Primitif & Tipe Data Primitif ke String
         System.out.println("Konversi String ke Tipe Data Primitif");
         System.out.print("Masukkan Nilai : ");
         String nilai_x = soal.next();
         int nilai_y = Integer.parseInt(nilai_x);
         System.out.println("Hasil Konversi : " + nilai_y);
         
         System.out.print("\n");
         
         System.out.println("Konversi Tipe Data Primitif ke String");
         System.out.print("Masukkan Nilai : ");
         int nilai_p = soal.nextInt();
         String nilai_q = String.valueOf(nilai_p);
         System.out.println("Hasil Konversi : " + nilai_q);
         
         System.out.print("\n");
         
        // Operator Aritmetika
         System.out.println("Operator Aritmetika");
         System.out.print("Masukkan Nilai Pertama : ");
         int x = soal.nextInt();
         System.out.print("Masukkan Nilai Kedua : ");
         int y = soal.nextInt();
         System.out.println("Hasil x + y = " + (x + y));
         System.out.println("Hasil x - y = " + (x - y));
         System.out.println("Hasil x * y = " + (x * y));
         System.out.println("Hasil x / y = " + (x / y));
         System.out.println("Hasil x % y = " + (x % y));
         
        System.out.print("\n");
        
        // Operator Penugasan
         System.out.println("Operator Penugasan");
         System.out.print("Masukkan Nilai Pertama : ");
         int a = soal.nextInt();
         System.out.print("Masukkan Nilai Kedua : ");
         int b = soal.nextInt();
         a += b;
         System.out.println("Penjumlahan = " + a);
         a -= b;
         System.out.println("Pengurangan = " + a);
         a *= b;
         System.out.println("Perkalian = " + a);
         a /= b;
         System.out.println("Pembagian = " + a);
         a %= b;
         System.out.println("Sisa Bagi = " + a);
         
         System.out.print("\n");
         
        // Operator Perbandingan
         System.out.println("Operator Perbandingan : Lebih Besar Lebih Kecil");
         System.out.print("Masukkan Nilai Pertama : ");
         int Q = soal.nextInt();
         System.out.print("Masukkan Nilai Kedua : ");
         int R = soal.nextInt();
         System.out.println("Nilai pertama > nilai kedua : " + (Q>R));
         System.out.println("Nilai pertama < nilai kedua : " + (Q<R));
         
         System.out.print("\n");
         System.out.println("SELESAI");
        
    }

           
}
