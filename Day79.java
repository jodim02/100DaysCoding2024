package project100dayscoding;

class Person {
    private String nama;
    private int umur;

    // Constructor
    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Override metode toString()
    @Override
    public String toString() {
        return "Nama: " + nama + ", Umur: " + umur + "thn";
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jodim", 19);
        System.out.println(person);
    }
}
