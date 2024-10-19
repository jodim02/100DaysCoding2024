package project100dayscoding;
import java.util.Scanner;
public class Day48{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai : ");
		int nilai = input.nextInt();
		if(nilai > 0){	
			System.out.println("Nilai Genap");
		}else{
			System.out.println("Nilai Ganjil");
		}
	}
}
