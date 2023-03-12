package Prioritas1;

import java.util.Scanner;
public class luasbangundatar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //segitiga
        float alas = 20, tinggi = 25;
        double luas_segitiga;

        //menghitung luas segitiga
        luas_segitiga = 0.5 * alas *tinggi;
        System.out.println("Luas Segitiga : "+luas_segitiga);

        //persegi panjang
        float panjang = 40, lebar = 6;
        double luas_persegipanjang;

        //menghitung luar persegi panjang
        luas_persegipanjang = panjang * lebar;
        System.out.println("Luas Persegi Panjang : "+luas_persegipanjang);

        //lingkaran
        double jari2 = 7;
        double luas_lingkaran;

        //menghitung luas lingkaran
        luas_lingkaran = 3.14 * jari2 * jari2;
        System.out.println("Luas Lingkaran : "+luas_lingkaran);
    }
}
