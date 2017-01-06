/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construct;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Abdullah Aflaha Aslam
 */
public class CRUDMySQL_peminjam implements CRUDInterfaces_peminjam {

    private Connection konek;

    @Override
    public void bukaKoneksi() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        konek = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rental", "root", "");
    }

    @Override
    public void tutupKoneksi() throws SQLException {
        konek.close();
    }

    @Override
    public ArrayList<peminjam> read() throws SQLException {
        Statement stat = konek.createStatement();
        ResultSet rs = stat.executeQuery("select * from rental.peminjam");
        ArrayList<peminjam> list = new ArrayList();
        while (rs.next()) {
            peminjam pm = new peminjam();
            pm.setId(rs.getInt(1));
            pm.setNamadepan(rs.getString(2));
            pm.setNamabelakang(rs.getString(3));
            pm.setTempatlahir(rs.getString(4));
            pm.setTanggallahir(rs.getString(5));
            pm.setJeniskelamin(rs.getString(6));
            pm.setAlamat(rs.getString(7));
            pm.setNotelp(rs.getString(8));
            pm.setStatus(rs.getString(9));
            pm.setNoidentitas(rs.getString(10));
            list.add(pm);
        }
        return list;
    }

    @Override
    public peminjam readById(int id) throws SQLException {
        PreparedStatement ps = konek.prepareStatement("select * from rental.peminjam where id_peminjam = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        peminjam Peminjam = new peminjam();
        while (rs.next()) {
            Peminjam.setId(rs.getInt(1));
            Peminjam.setNamadepan(rs.getString(2));
            Peminjam.setNamabelakang(rs.getString(3));
            Peminjam.setTempatlahir(rs.getString(4));
            Peminjam.setTanggallahir(rs.getString(5));
            Peminjam.setJeniskelamin(rs.getString(6));
            Peminjam.setAlamat(rs.getString(7));
            Peminjam.setNotelp(rs.getString(8));
            Peminjam.setStatus(rs.getString(9));
            Peminjam.setNoidentitas(rs.getString(10));
        }
        return Peminjam;
    }

    @Override
    public void create(peminjam ba) throws SQLException {
        String query = "insert into rental.peminjam(Nama_Depan, Nama_Belakang, Tempat_Lahir,Tanggal_Lahir, Jenis_Kelamin, Alamat, No_Telp, Status, No_Identitas) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement pj = konek.prepareStatement(query);

        pj.setString(1, ba.getNamadepan());
        pj.setString(2, ba.getNamabelakang());
        pj.setString(3, ba.getTempatlahir());
        pj.setString(4, ba.getTanggallahir());
        pj.setString(5, ba.getJeniskelamin());
        pj.setString(6, ba.getAlamat());
        pj.setString(7, ba.getNotelp());
        pj.setString(8, ba.getStatus());
        pj.setString(9, ba.getNoidentitas());
        pj.execute();
    }

    @Override
    public void delete(peminjam ba) throws SQLException {
        PreparedStatement pj = konek.prepareStatement("delete from peminjam where id_peminjam=?");
        pj.setInt(1, ba.getId());
        pj.execute();
    }

    @Override
    public void update(peminjam ba) throws SQLException {
        String query = "update rental.peminjam set Nama_Depan=?, Nama_Belakang=?, Tempat_Lahir=?,Tanggal_Lahir=?, Jenis_Kelamin=?, Alamat=?, No_Telp=?, Status=?, No_Identitas=? where id_peminjam=?";
        PreparedStatement kr = konek.prepareStatement(query);
        kr.setString(1, ba.getNamadepan());
        kr.setString(2, ba.getNamabelakang());
        kr.setString(3, ba.getTempatlahir());
        kr.setString(4, ba.getTanggallahir());
        kr.setString(5, ba.getJeniskelamin());
        kr.setString(6, ba.getAlamat());
        kr.setString(7, ba.getNotelp());
        kr.setString(8, ba.getStatus());
        kr.setString(9, ba.getNoidentitas());
        kr.setInt(10, ba.getId());
        kr.execute();
    }

}
