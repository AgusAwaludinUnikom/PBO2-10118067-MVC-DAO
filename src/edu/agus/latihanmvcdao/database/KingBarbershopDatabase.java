/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.agus.latihanmvcdao.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.agus.latihanmvcdao.impl.PelangganDaoImpl;
import edu.agus.latihanmvcdao.service.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *	
 * @author
 * Nama     : Agus Awaludin
 * Nim      : 10118067
 * Kelas    : PBO2
 * 
 */
public class KingBarbershopDatabase {
    private static final String URL_CONNECTION = "jdbc:mysql://localhost:3306/kingsbarbershop";
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException {
        if(connection == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL(URL_CONNECTION);
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        
        return connection;
    }
    
    public static PelangganDao getPelangganDao() throws SQLException {
        if(pelangganDao == null) {
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        return pelangganDao;
    }
}
