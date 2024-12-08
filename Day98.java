package project100dayscoding;
import java.util.Scanner;
public class Day98 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nilai x : ");
        int x = in.nextInt();
        System.out.print("Nilai y : ");
        int y = in.nextInt();
        int jumlah = 0;
        for(int a = x; a <= y; a++){
            if(a%2==0){
                System.out.print(a+" ");
                jumlah += a;
            }
        }
        System.out.println(" ");
        System.out.println("Total Pejumlahan bilangan genap dari x ke y : " + jumlah);
    }
}
