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
 * @author Imbisil
 */
public class CRUDSQLite_karyawan implements CRUDInterface_karyawan {

    private Connection konek;

    @Override
    public void bukaKoneksi() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        konek = DriverManager.getConnection("jdbc:sqlite:rental.db");
    }

    @Override
    public void tutupKoneksi() throws SQLException {
        konek.close();
    }

    @Override
    public ArrayList<karyawan> read() throws SQLException {
        Statement stat = konek.createStatement();
        ResultSet rs = stat.executeQuery("select * from karyawan");
        ArrayList<karyawan> list = new ArrayList();
        while (rs.next()) {
            karyawan kr = new karyawan();
            kr.setId(rs.getInt(1));
            kr.setNamadepan(rs.getString(2));
            kr.setNamabelakang(rs.getString(3));
            kr.setTempatlahir(rs.getString(4));
            kr.setTanggallahir(rs.getString(5));
            kr.setJeniskelamin(rs.getString(6));
            kr.setAlamat(rs.getString(7));
            kr.setNotelp(rs.getString(8));
            kr.setStatus(rs.getString(9));
            kr.setNoidentitas(rs.getString(10));
            list.add(kr);
        }
        return list;
    }

    @Override
    public karyawan readById(int id) throws SQLException {
        PreparedStatement ps = konek.prepareStatement("select * from karyawan where id_karyawan = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        karyawan kr = new karyawan();
        while (rs.next()) {
            kr.setId(rs.getInt(1));
            kr.setNamadepan(rs.getString(2));
            kr.setNamabelakang(rs.getString(3));
            kr.setTempatlahir(rs.getString(4));
            kr.setTanggallahir(rs.getString(5));
            kr.setJeniskelamin(rs.getString(6));
            kr.setAlamat(rs.getString(7));
            kr.setNotelp(rs.getString(8));
            kr.setStatus(rs.getString(9));
            kr.setNoidentitas(rs.getString(10));
        }
        return kr;
    }

    @Override
    public void create(karyawan ba) throws SQLException {
        String query = "insert into karyawan (Nama_Depan, Nama_Belakang, Tempat_Lahir, Tanggal_Lahir, Jenis_Kelamin, Alamat, No_Telp, Status, No_Identitas) values (?,?,?,?,?,?,?,?,?)";
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
        kr.execute();
    }

    @Override
    public void delete(karyawan ba) throws SQLException {
        PreparedStatement kr = konek.prepareStatement("delete from karyawan where id_karyawan=?");
        kr.setInt(1, ba.getId());
        kr.execute();
    }

    @Override
    public void update(karyawan ba) throws SQLException {
        String query = "update karyawan set Nama_Depan=?, Nama_Belakang=?, Tempat_Lahir=?, Jenis_Kelamin=?, Alamat=?, No_Telp=?, Status=?, No_Identitas=? where id_karyawan=?";
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
