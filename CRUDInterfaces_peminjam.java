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
public interface CRUDInterfaces_peminjam {
    
    public void bukaKoneksi() throws ClassNotFoundException, SQLException;

    public void tutupKoneksi() throws SQLException;

    public ArrayList<peminjam> read() throws SQLException;

    public peminjam readById(int id) throws SQLException;

    public void create(peminjam ba) throws SQLException;

    public void delete(peminjam ba) throws SQLException;

    public void update(peminjam ba) throws SQLException;
}
