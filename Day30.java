package Coding100Hari;
import java.math.BigDecimal;
public class Day30{
    
    public static void main(String[] args) {
        BigDecimal nilaiA = new BigDecimal("12345.6789");
        BigDecimal nilaiB = new BigDecimal("98765.4321");
        
        //Pemjumlahan nilaA & nilaiB
        BigDecimal hasilJumlah = nilaiA.add(nilaiB);
        System.out.println("Hasil Jumlah = " + hasilJumlah);
    }
    
}
