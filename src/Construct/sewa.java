/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construct;

/**
 *
 * @author Imbisil
 */
public class sewa {
    
    private int idsewa;
    private int idkaryawan;
    private int idpelanggan;
    private String tanggalpinjam;
    private String tanggalkembali;
    private int totalbiaya;
    private int denda; 

    public sewa() {
    }

    public sewa(int idsewa, int idkaryawan, int idpelanggan, String tanggalpinjam, String tanggalkembali, int totalbiaya, int denda) {
        this.idsewa = idsewa;
        this.idkaryawan = idkaryawan;
        this.idpelanggan = idpelanggan;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
        this.totalbiaya = totalbiaya;
        this.denda = denda;
    }

    public int getIdsewa() {
        return idsewa;
    }

    public void setIdsewa(int idsewa) {
        this.idsewa = idsewa;
    }

    public int getIdkaryawan() {
        return idkaryawan;
    }

    public void setIdkaryawan(int idkaryawan) {
        this.idkaryawan = idkaryawan;
    }

    public int getIdpelanggan() {
        return idpelanggan;
    }

    public void setIdpelanggan(int idpelanggan) {
        this.idpelanggan = idpelanggan;
    }

    public String getTanggalpinjam() {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public String getTanggalkembali() {
        return tanggalkembali;
    }

    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    public int getTotalbiaya() {
        return totalbiaya;
    }

    public void setTotalbiaya(int totalbiaya) {
        this.totalbiaya = totalbiaya;
    }

    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }
    
    
    
}
