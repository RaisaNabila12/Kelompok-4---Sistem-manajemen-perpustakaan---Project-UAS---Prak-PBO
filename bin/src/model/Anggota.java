package model;

/**
 * Kelas yang merepresentasikan pengguna dengan hak akses Anggota (User).
 */
public class Anggota extends Pengguna {
    private String tanggalBergabung;

    public Anggota(String idPengguna, String nama, String username, String password, String tanggalBergabung) {
        super(idPengguna, nama, username, password);
        this.tanggalBergabung = tanggalBergabung;
    }

    /**
     * Implementasi method abstrak: menampilkan menu Anggota.
     */
