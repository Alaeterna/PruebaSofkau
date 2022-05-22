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

    String bd = "";                                         //Base de datos a utilziar
    String url = "jdbc:mysql://localhost:3306/";           //dirrecion local de MYSQL
    String user = "root";                                 //Usuario con el que mme conecto a mysql
    String password = "mysql";                           // Contraseña del usuario 
    String driver = "com.mysql.cj.jdbc.Driver";         // Driver para conectar java con MYSQL 
    Connection cx;
    
    //Constructor que inicia bd sin datos
    public ConSQL() {
        this.bd = bd;
    }
    
    //Constructor que conecta MYSQL con la base de datos selecionada String bd
    public ConSQL(String bd) {
        this.bd = bd;
    }
    
    //Establece la conexion con MYSQL
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
    
    //Desconectar con MYSQL
    public void Desconectar() {
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
