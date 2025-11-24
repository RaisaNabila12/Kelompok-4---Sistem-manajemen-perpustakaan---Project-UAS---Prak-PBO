package model;

/**
 * Kelas yang merepresentasikan pengguna dengan hak akses Admin.
 */
public class Admin extends Pengguna {

    public Admin(String idPengguna, String nama, String username, String password) {
        super(idPengguna, nama, username, password);
    }
