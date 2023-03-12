package Prioritas1;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println("===");
        Product p1 = new Product("coffe", "this is coffe", 15000, 10);
        p1.getInfo();
        System.out.println("nama : "+p1.getNama());
        System.out.println("deskripsi : "+p1.getDeskripsi());
        System.out.println("harga : "+p1.getHarga());
        System.out.println("stok "+p1.getStok());

        System.out.println("===");
        Product p2 = new Product("milk", "this is fresh milk", 25000, 10);
        p2.getInfo();
        System.out.println("nama : "+p2.getNama());
        System.out.println("deskripsi : "+p2.getDeskripsi());
        System.out.println("harga : "+p2.getHarga());
        System.out.println("stok "+p2.getStok());

        System.out.println("===");
        Product p3 = new Product("apple juice", "this is juice", 18000, 20);
        p1.getInfo();
        System.out.println("nama : "+p3.getNama());
        System.out.println("deskripsi : "+p3.getDeskripsi());
        System.out.println("harga : "+p3.getHarga());
        System.out.println("stok "+p3.getStok());

    }
}
