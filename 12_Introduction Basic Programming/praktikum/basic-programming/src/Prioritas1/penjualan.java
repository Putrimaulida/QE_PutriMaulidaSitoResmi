package Prioritas1;

import java.util.Scanner;
public class penjualan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaBeli, hargaJual;

        System.out.print("Masukkan harga beli : ");
        hargaBeli = input.nextInt();
        System.out.print("Masukkan harga jual : ");
        hargaJual = input.nextInt();

        if (hargaBeli < hargaJual) {
            int untung = hargaJual - hargaBeli;
            System.out.println("untung sebesar : " + untung);
        } else if (hargaBeli > hargaJual) {
            int rugi = hargaBeli - hargaJual;
            System.out.println("rugi sebesar : " + rugi);
        } else if (hargaBeli==hargaJual) {
            System.out.println("sama saja");
        }
    }
}
