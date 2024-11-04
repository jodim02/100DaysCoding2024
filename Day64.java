package project100dayscoding;

public class Day64 {
    
    public static void main(String[] args) {
        myLoop:
        for(int a=0; a<10; a++){
            if(a==5){
                break myLoop;
            }
            System.out.println("a : "+ a);
        }
        System.out.println("Selesai");
    }
}
