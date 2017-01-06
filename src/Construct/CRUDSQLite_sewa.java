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
 * @author user
 */
public class CRUDSQLite_sewa implements CRUDInterface_sewa {

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
    public ArrayList<sewa> read() throws SQLException {
        Statement stat = konek.createStatement();
        ResultSet rs = stat.executeQuery("select * from sewa");
        ArrayList<sewa> list = new ArrayList();
        while (rs.next()) {
            sewa sw = new sewa();
            sw.setIdsewa(rs.getInt(1));
            sw.setIdkaryawan(rs.getInt(2));
            sw.setIdpelanggan(rs.getInt(3));
            sw.setTanggalpinjam(rs.getString(4));
            sw.setTanggalkembali(rs.getString(5));
            sw.setTotalbiaya(rs.getInt(6));
            sw.setDenda(rs.getInt(7));
            list.add(sw);
        }
        return list;
    }
    
    @Override
    public sewa readById(int id) throws SQLException {
        PreparedStatement ps = konek.prepareStatement("select * from sewa where id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        sewa sw = new sewa();
        while (rs.next()) {
            sw.setIdsewa(rs.getInt(1));
            sw.setIdkaryawan(rs.getInt(2));
            sw.setIdpelanggan(rs.getInt(3));
            sw.setTanggalpinjam(rs.getString(4));
            sw.setTanggalkembali(rs.getString(5));
            sw.setTotalbiaya(rs.getInt(6));
            sw.setDenda(rs.getInt(7));
        }
        return sw;
    }

    @Override
    public void create(sewa ba) throws SQLException {
        String query = "insert into sewa (id_sewa, id_karyawan, id_pelanggan,Tanggal_pinjam,Lama_pinjam, Tanggal_kembali, Total_biaya,Denda,) values (?,?,?,?,?,?,?,?)";
        PreparedStatement sw = konek.prepareStatement(query);
            sw.setInt(1, ba.getIdkaryawan());
            sw.setInt(2, ba.getIdpelanggan());
            sw.setString(3, ba.getTanggalpinjam());
            sw.setString(4, ba.getTanggalkembali());
            sw.setInt(5, ba.getTotalbiaya());
            sw.setInt(6, ba.getDenda());
            sw.execute();
    }

    @Override
    public void delete(sewa ba) throws SQLException {
        PreparedStatement sw = konek.prepareStatement("delete from sewa where id=?");
        sw.setInt(1, ba.getIdkaryawan());
        sw.setInt(2, ba.getIdpelanggan());
        sw.execute();
    }

    @Override
    public void update(sewa ba) throws SQLException {
        String query = "update sewa set id_sewa=?, id_karyawan=?, id_pelanggan=?, Tanggal_pinjam=?, Lama_pinjam=?, Tanggal_kembali=?, Total_biaya=?, Denda=? where id=?";
        PreparedStatement sw = konek.prepareStatement(query);
            sw.setInt(1, ba.getIdkaryawan());
            sw.setInt(2, ba.getIdpelanggan());
            sw.setString(3, ba.getTanggalpinjam());
            sw.setString(4, ba.getTanggalkembali());
            sw.setInt(5, ba.getTotalbiaya());
            sw.setInt(6, ba.getDenda());
            sw.execute();
    }
}
    

