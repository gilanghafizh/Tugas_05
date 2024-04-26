import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");
        System.out.print("Masukkan nama pembeli: ");
        String nama = scanner.nextLine();

        System.out.println("\nPilih tahap pembelian: ");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2): ");
        int tahapPembelian = scanner.nextInt();

        Tiket tiket = null;
        if (tahapPembelian == 1) {
            System.out.println("\nPilih jenis tiket:");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): ");
            int jenisTiket = scanner.nextInt();
            if (jenisTiket == 1 ) {
                tiket = new VIP(150 * 0.8);
            } else if (jenisTiket == 2) {
                tiket = new VVIP(200 * 0.8);
            } else {
                System.out.println("Input tidak valid!");
                System.exit(0);
            }

        } else if (tahapPembelian == 2){
            System.out.println("\nPilih jenis tiket:");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3): ");
            int jenisTiket = scanner.nextInt();
            if (jenisTiket == 1) {
                tiket = new Festival(100);
            } else if (jenisTiket == 2) {
                tiket = new VIP(150);
            } else if (jenisTiket == 3) {
                tiket = new VVIP(200);
            } else {
                System.out.println("Input tidak valid!");
                System.exit(0);
            }

        } else {
            System.out.println("Input tidak valid!");
            System.exit(0);
        }
        
        System.out.println("\nMasukkan jumlah tiket yang ingin dibeli: ");
        int jumlahTiket = scanner.nextInt();

        Pemesanan pesanan = new Pemesanan(nama, tahapPembelian == 1 ? "Presale" : "Reguler", tiket, jumlahTiket);
        pesanan.cetakNota();
        scanner.close();
    }
}
