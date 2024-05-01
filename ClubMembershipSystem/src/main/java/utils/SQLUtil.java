/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J Mends
 */
public class SQLUtil {
    private Connection con;
    private Statement stm;
    
    public SQLUtil(){
        try {
            String url = "jdbc:mysql://localhost:3306/clubdatabase?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "root";
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(SQLUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Connection getConnection(){
        return con;
    }
    public Statement getStatement(){
        return stm;
    }
    public void closeConnection(){
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int executeUpdate(String cmd){
        try {
            return this.stm.executeUpdate(cmd);
        } catch (SQLException ex) {
            Logger.getLogger(SQLUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
}
    public ResultSet executeQuery(String cmd){
        try {
            return this.stm.executeQuery(cmd);
                    } catch (SQLException ex) {
            Logger.getLogger(SQLUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
 }
    
}
