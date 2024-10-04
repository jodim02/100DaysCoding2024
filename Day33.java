package Coding100Hari;

public class Day33 {
    
    public static void main(String[] args) {
        /*Type Casting :
        Proses mengubah tipe data suatu variabel
        menjadi tipe data yang berbeda
        */
        
        //Widening Casting -> tipe data kecil ke besar
        int A = 33;
        double B = A;
        
        //Narrowing Casting -> tipe data besar ke kecil
        double C = 33.0;
        int D = (int) C;
        
        //Output
        System.out.println("Nilai 1 : " + B);
        System.out.println("Nilai 2 : " + D);
    }
    
}
