package model;

/**
 * Kelas yang merepresentasikan proses Peminjaman/Pengembalian buku.
 */
public class Transaksi {
    private static int counter = 1;
    private String idTransaksi;
    private Anggota anggota;
    private Buku buku;
    private String tglPinjam;
    private String tglKembali;
    private String status; 

    public Transaksi(Anggota anggota, Buku buku, String tglPinjam) {
        this.idTransaksi = "TRX" + String.format("%03d", counter++);
        this.anggota = anggota;
        this.buku = buku;
        this.tglPinjam = tglPinjam;
        this.status = "DIPINJAM";
    }

    // Encapsulation: Getters
    public String getIdTransaksi() {
        return idTransaksi;
    }

    public Anggota getAnggota() {
        return anggota;
    }
    
    public Buku getBuku() {
        return buku;
    }
    
    public String getTglPinjam() {
        return tglPinjam;
    }
    
    public String getStatus() {
        return status;
    }

    public String getTglKembali() {
        return tglKembali;
    }
    
    // Method khusus saat pengembalian
    public void setPengembalian(String tglKembali) {
        this.tglKembali = tglKembali;
        this.status = "SELESAI";
    }
}