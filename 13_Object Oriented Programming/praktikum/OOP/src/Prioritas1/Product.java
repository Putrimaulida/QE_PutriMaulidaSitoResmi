package Prioritas1;

public class Product {
    private String nama;
    private String deskripsi;
    private int harga;
    private int stok;

    Product(String nama, String deskripsi, int harga, int stok){
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.stok = stok;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public void setStok(int stok){
        this.stok = stok;
    }

    public String getNama(){
        return nama;
    }
    public String getDeskripsi(){
        return deskripsi;
    }
    public int getHarga(){
        return harga;
    }

    public int getStok(){
        return stok;
    }

    public void getInfo(){
        System.out.println("===");
        System.out.println("INFO PRODUK");
    }
}
