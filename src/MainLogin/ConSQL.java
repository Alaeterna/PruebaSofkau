/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainLogin;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class ConSQL {

    String bd = "";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "mysql";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;
    
    public ConSQL() {
        this.bd = bd;
    }
    
    public ConSQL(String bd) {
        this.bd = bd;
    }

    public Connection Conectar() {
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url + bd, user, password);
            System.out.println("Conexion Exitosa a " + bd);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se conecto a base de datos: " + bd);
            Logger.getLogger(ConSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }

    public void Desconectar() {
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
