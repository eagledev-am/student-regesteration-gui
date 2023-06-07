/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentrigestration;
import java.sql.*;
/**
 *
 * @author ABDO
 */
public class ConnectionDb {
    private String host = "jdbc:mysql://localhost/studendregister";
    private String userName = "root";
    private String password = "";
    
    public Connection connect () throws SQLException{
        return DriverManager.getConnection(host , userName , password);
    }
}
