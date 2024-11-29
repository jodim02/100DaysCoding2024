package project100dayscoding;

public class SOAL_2 {
    public static void main(String[] args) {
        int[] nilai ={85,90,78,88,92};
        System.out.println("Nilai Sebelum pembaruan :");
        for(int a = 0; a < nilai.length; a++){
            System.out.println("Nilai ke-" + (a+1) + ":" + nilai[a]);
        }
        System.out.println(" ");
        // Pembaruan Nilai
        nilai[3] = 89;
        System.out.println("Nilai setelah perubahan :");
        for(int update : nilai){
            System.out.println(update);
        }
        System.out.println(" ");
        // Rata-rata nilai
        int total = 0;
        for(int update : nilai){
            total += update;
        }
        double average = total / (double)nilai.length;
        System.out.println("Rata-rata nilai : " + average);
    }
}
