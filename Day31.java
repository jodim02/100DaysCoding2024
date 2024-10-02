package Coding100Hari;

public class Day31{
    
    public static void main(String[] args) {
        String a = "31";
        //Konversi a ke tipe data primitif
        byte b = Byte.parseByte(a);
        short c = Short.parseShort(a);
        int d = Integer.parseInt(a);
        long e = Long.parseLong(a);
        
        //Memamggil output
        System.out.println("Nilai b : " + b);
        System.out.println("Nilai c : " + c);
        System.out.println("Nilai d : " + d);
        System.out.println("Nilai e : " + e);
    }
    
}
