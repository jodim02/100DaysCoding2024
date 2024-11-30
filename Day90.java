package project100dayscoding;

public class SOAL_3 {
    public static void main(String[] args) {
        double [] nilai = {91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11, 
            27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4, 53.21, 3.42, 
            0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768};
        
        // Inisialisasi variabel min, max, sum
        double min = nilai[0];
        double max = nilai[0];
        double sum = 0;
        
        // Menghitung nilai min, max, sum
        for(double nilai1 : nilai){
            if(nilai1 < min){
                min = nilai1;
            }
            if(nilai1 > max){
                max = nilai1;
            }
            sum += nilai1; 
        }
        // Menghitung rata-rata
        double average = sum / nilai.length;
        
        // output
        System.out.println("Data MIN : " + min);
        System.out.println("Data MAX : " + max);
        System.out.println("Data SUM : " + sum);
        System.out.println("Data AVG : " + average);
    }
}
