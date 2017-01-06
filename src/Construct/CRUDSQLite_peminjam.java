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
public class CRUDSQLite_peminjam implements CRUDInterfaces_peminjam {

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
    public ArrayList<peminjam> read() throws SQLException {
        Statement stat = konek.createStatement();
        ResultSet rs = stat.executeQuery("select * from peminjam");
        ArrayList<peminjam> list = new ArrayList();
        while (rs.next()) {
            peminjam kr = new peminjam();
            kr.setId(rs.getInt(1));
            kr.setNamadepan(rs.getString(2));
            kr.setNamabelakang(rs.getString(3));
            kr.setTempatlahir(rs.getString(4));
            kr.setTanggallahir(rs.getString(5));
            kr.setJeniskelamin(rs.getString(6));
            kr.setAlamat(rs.getString(7));
            kr.setNotelp(rs.getInt(8));
            kr.setStatus(rs.getString(9));
            kr.setNoidentitas(rs.getInt(10));
            list.add(kr);
        }
        return list;
    }

    @Override
    public peminjam readById(int id) throws SQLException {
        PreparedStatement ps = konek.prepareStatement("select * form peminjam where id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        peminjam kr = new peminjam();
        while (rs.next()) {
            kr.setId(rs.getInt(1));
            kr.setNamadepan(rs.getString(2));
            kr.setNamabelakang(rs.getString(3));
            kr.setTempatlahir(rs.getString(4));
            kr.setTanggallahir(rs.getString(5));
            kr.setJeniskelamin(rs.getString(6));
            kr.setAlamat(rs.getString(7));
            kr.setNotelp(rs.getInt(8));
            kr.setStatus(rs.getString(9));
            kr.setNoidentitas(rs.getInt(10));
        }
        return kr;
    }

    @Override
    public void create(peminjam ba) throws SQLException {
        String query = "insert into peminjam (id_peminjam, Nama_Depan, Nama_Belakang,Tempat_Lahir,Tanggal_Lahir, Jenis_Kelamin, Alamat,No_Telp,Status,No_Idenetitas) values (?,?,?,?,?,?,?,?)";
        PreparedStatement kr = konek.prepareStatement(query);

        kr.setString(1, ba.getNamadepan());
        kr.setString(2, ba.getNamabelakang());
        kr.setString(3, ba.getTempatlahir());
        kr.setString(4, ba.getTanggallahir());
        kr.setString(5, ba.getJeniskelamin());
        kr.setString(6, ba.getAlamat());
        kr.setInt(7, ba.getNotelp());
        kr.setString(8, ba.getStatus());
        kr.setInt(9, ba.getNoidentitas());
        kr.execute();
    }

    @Override
    public void delete(peminjam ba) throws SQLException {
        PreparedStatement kr = konek.prepareStatement("delete from peminjam where id=?");
        kr.setInt(1, ba.getId());
        kr.execute();
    }

    @Override
    public void update(peminjam ba) throws SQLException {
     String query = "update peminjam set Nama_Depan=?, Nama_Belakang=?, Tempat_Lahir=?, Jenis_Kelamin=?, Alamat=?, No_Telp=?,Status=?,No_Identitas=? where id=?";
        PreparedStatement kr = konek.prepareStatement(query);
        kr.setInt(1, ba.getId());
        kr.setString(1, ba.getNamadepan());
        kr.setString(2, ba.getNamabelakang());
        kr.setString(3, ba.getTempatlahir());
        kr.setString(4, ba.getTanggallahir());
        kr.setString(5, ba.getJeniskelamin());
        kr.setString(6, ba.getAlamat());
        kr.setInt(7, ba.getNotelp());
        kr.setString(8, ba.getStatus());
        kr.setInt(9, ba.getNoidentitas());
        kr.execute();   
    }

}
