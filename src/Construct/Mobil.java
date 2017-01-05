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
public class Mobil {
    private int id;
    private String Jenis;
    private String Merk;
    private String Plat;
    private String Status;
    private int Tahun;
    private String Warna;
    private int Sewa;
    private int Denda;

    public Mobil() {
    }

    public Mobil(int id, String Jenis, String Merk, String Plat, String Status, int Tahun, String Warna, int Sewa, int Denda) {
        this.id = id;
        this.Jenis = Jenis;
        this.Merk = Merk;
        this.Plat = Plat;
        this.Status = Status;
        this.Tahun = Tahun;
        this.Warna = Warna;
        this.Sewa = Sewa;
        this.Denda = Denda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public String getPlat() {
        return Plat;
    }

    public void setPlat(String Plat) {
        this.Plat = Plat;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getTahun() {
        return Tahun;
    }

    public void setTahun(int Tahun) {
        this.Tahun = Tahun;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public int getSewa() {
        return Sewa;
    }

    public void setSewa(int Sewa) {
        this.Sewa = Sewa;
    }

    public int getDenda() {
        return Denda;
    }

    public void setDenda(int Denda) {
        this.Denda = Denda;
    }
    
    
    
    
}
