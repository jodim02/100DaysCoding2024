package project100dayscoding;

public class Day72 {
    public static void hitungMundur(int n){
        if(n <= 0){
            return;
        }else{
            System.out.println(n);
            hitungMundur(n - 1);
        }
    }
    
    public static void main(String[] args) {
        int angka = 5;
        hitungMundur(angka);
    }
    
}
