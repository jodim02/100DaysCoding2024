package project100dayscoding;

public class Day87 {
    
    public static void main(String[] args) {
        // Array nilai awal
        int[] nilai = {1,2,3,4,5};
        System.out.println("Sebelum perubahan :");
        for(int elemen : nilai){
            System.out.println(elemen);
        }
        System.out.println("__________________");
        System.out.println(" ");
        // Mengubah nilai elemen pada index ke-2
        nilai[2] = 87;
        System.out.println("Setelah perubahan :");
        for(int update : nilai){
            System.out.println(update);
        }
    }
}
