package service;

import model.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalDate;

/**
 * Kelas utama yang mengelola koleksi data dan menyediakan fungsionalitas utama sistem.
 * Menerapkan konsep Collection (HashMap dan ArrayList).
 */
public class PerpustakaanService {
    
    private Map<String, Pengguna> daftarPengguna; 
    private List<Buku> daftarBuku; 
    private List<Transaksi> daftarTransaksi;

    public PerpustakaanService() {
        this.daftarPengguna = new HashMap<>();
        this.daftarBuku = new ArrayList<>();
        this.daftarTransaksi = new ArrayList<>();
        
        inisialisasiData();
    }
