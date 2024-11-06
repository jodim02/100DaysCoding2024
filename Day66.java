package project100dayscoding;

public class Day66 {
    
    public static void main(String[] args) {
        // Pola persegi
        System.out.println("Pola Persegi\n");
        for(int a = 1; a <= 4; a++){
            for(int b = 1; b <= 4; b++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("   ");
        
        // Pola persegi panjang
        System.out.println("Pola Persegi Panjang\n");
        for(int x = 1; x <= 4; x++){
            for(int y = 1; y <= 6; y++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
