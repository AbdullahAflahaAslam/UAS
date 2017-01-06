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
public class karyawan {
    
    private int id;
    private String namadepan;
    private String namabelakang;
    private String tempatlahir;
    private String tanggallahir;
    private String jeniskelamin;
    private String alamat;
    private String notelp;
    private String status;
    private String noidentitas;

    public karyawan() {
    }

    public karyawan(int id, String namadepan, String namabelakang, String tempatlahir, String tanggallahir, String jeniskelamin, String alamat, String notelp, String status, String noidentitas) {
        this.id = id;
        this.namadepan = namadepan;
        this.namabelakang = namabelakang;
        this.tempatlahir = tempatlahir;
        this.tanggallahir = tanggallahir;
        this.jeniskelamin = jeniskelamin;
        this.alamat = alamat;
        this.notelp = notelp;
        this.status = status;
        this.noidentitas = noidentitas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamadepan() {
        return namadepan;
    }

    public void setNamadepan(String namadepan) {
        this.namadepan = namadepan;
    }

    public String getNamabelakang() {
        return namabelakang;
    }

    public void setNamabelakang(String namabelakang) {
        this.namabelakang = namabelakang;
    }

    public String getTempatlahir() {
        return tempatlahir;
    }

    public void setTempatlahir(String tempatlahir) {
        this.tempatlahir = tempatlahir;
    }

    public String getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(String tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNoidentitas() {
        return noidentitas;
    }

    public void setNoidentitas(String noidentitas) {
        this.noidentitas = noidentitas;
    }
    
    
    
}
