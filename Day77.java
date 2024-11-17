package project100dayscoding;

public class Day77 {
    public static void main(String[] args) {
        // Method equals
        String a = "Positif";
        String b = "Negatif";
        String c = "Positif";
        
        boolean banding1 = a.equals(b);
        boolean banding2 = a.equals(c);
        
        System.out.println("Perbandingan a : b = " + banding1);
        System.out.println("Perbandingan a : c = " + banding2);
    }
}
