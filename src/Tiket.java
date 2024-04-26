// Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    private double harga;

    public Tiket(double harga){
        this.harga = harga;
    }

    public double getHarga(){
        return harga;
    }
}