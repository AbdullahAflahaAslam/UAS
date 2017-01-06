/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construct;

import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public interface CRUDInterface_sewa {
    
    public void bukaKoneksi() throws ClassNotFoundException, SQLException;

    public void tutupKoneksi() throws SQLException;

    public ArrayList<sewa> read() throws SQLException;

    public sewa readById(int id) throws SQLException;

    public void create(sewa ba) throws SQLException;

    public void delete(sewa ba) throws SQLException;

    public void update(sewa ba) throws SQLException;
}