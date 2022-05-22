/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaGame;

import MainLogin.ConSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Niveles {

    ConSQL cx;                              // Objeto conexion SQL
    PreparedStatement ps = null;           // Creando comando sql
    ResultSet rs = null;                  // Resultado del comando sql 
    Preguntas pr1;                       // Objeto Preguntas 
    String query = "";                  // Sentencia ejecutada en MYSQL

    private final List<Preguntas> pre1 = new ArrayList<>();                   // Se crea una lista para la insercion las preguntas
    private final List<Preguntas> pre2 = new ArrayList<>();                  // Se crea una lista para la insercion las preguntas
    private final List<Preguntas> pre3 = new ArrayList<>();                 // Se crea una lista para la insercion las preguntas
    private final List<Preguntas> pre4 = new ArrayList<>();                // Se crea una lista para la insercion las preguntas
    private final List<Preguntas> pre5 = new ArrayList<>();               // Se crea una lista para la insercion las preguntas
    

    //Constructor Niveles Inicia las variables

    public Niveles() {
        this.cx = new ConSQL("tablasj");    // Conexion base de datos tablassj
        this.query = "";                   // Iniciando comando query EMPY
    }

    //Cargando las preguntas Level 1 en la lista
    public void LoadLevel1() {
        try {

            query = "SELECT * FROM Level1";                      // Comando query mostrar tabla Level1
            this.ps = cx.Conectar().prepareStatement(query);    // Se ejecuta el comando
            this.rs = ps.executeQuery();                       // Resultado del comando query

            //Se guardan los datos en el objeto preguntos en sus respectivas variables
            while (rs.next()) {
                pr1 = new Preguntas();
                pr1.setNum(this.rs.getInt("Num"));
                pr1.setPregunta(this.rs.getString("Pregunta"));
                pr1.setOpt1(this.rs.getString("Opt1"));
                pr1.setOpt2(this.rs.getString("Opt2"));
                pr1.setOpt3(this.rs.getString("Opt3"));
                pr1.setRes(this.rs.getString("Res"));
                pre1.add(pr1);
            }

            //Se imprime por consola las preguntas del nivel
            System.out.println("Tamaño de la lista: " + pre1.size());
            for (Preguntas p : pre1) {
                System.out.println("Num: " + p.getNum());
                System.out.println("Pregunta: " + p.getPregunta());
                System.out.println("A: " + p.getOpt1());
                System.out.println("B: " + p.getOpt2());
                System.out.println("C: " + p.getOpt3());
                System.out.println("D: " + p.getRes());
                System.out.println("--------------------------------------------");
            }
        } catch (SQLException ex) {
            // Enn caso de tener un error se ejecuta el siguiente conando
            java.util.logging.Logger.getLogger(Niveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } finally {
            //Finalmente se cierra la conexion con MYSQL para liberar recursos de maquina
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (cx != null) {
                    cx.Desconectar();
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }

    //Cargando las preguntas Level 2 en la lista
    public void LoadLevel2() {
        try {
            query = "SELECT * FROM Level2";                      // Comando query mostrar tabla Level1
            this.ps = cx.Conectar().prepareStatement(query);    // Se ejecuta el comando
            this.rs = ps.executeQuery();                       // Resultado del comando query

            //Se guardan los datos en el objeto preguntos en sus respectivas variables
            while (rs.next()) {
                pr1 = new Preguntas();
                pr1.setNum(this.rs.getInt("Num"));
                pr1.setPregunta(this.rs.getString("Pregunta"));
                pr1.setOpt1(this.rs.getString("Opt1"));
                pr1.setOpt2(this.rs.getString("Opt2"));
                pr1.setOpt3(this.rs.getString("Opt3"));
                pr1.setRes(this.rs.getString("Res"));
                pre2.add(pr1);
            }

            //Se imprime por consola las preguntas del nivel
            System.out.println("Tamaño de la lista: " + pre2.size());
            for (Preguntas p : pre2) {
                System.out.println("Num: " + p.getNum());
                System.out.println("Pregunta: " + p.getPregunta());
                System.out.println("A: " + p.getOpt1());
                System.out.println("B: " + p.getOpt2());
                System.out.println("C: " + p.getOpt3());
                System.out.println("D: " + p.getRes());
                System.out.println("--------------------------------------------");
            }
        } catch (SQLException ex) {
            // Enn caso de tener un error se ejecuta el siguiente conando
            java.util.logging.Logger.getLogger(Niveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } finally {
            //Finalmente se cierra la conexion con MYSQL para liberar recursos de maquina
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (cx != null) {
                    cx.Desconectar();
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }

//Cargando las preguntas Level 3 en la lista
    public void LoadLevel3() {
        try {

            query = "SELECT * FROM Level3";                      // Comando query mostrar tabla Level1
            this.ps = cx.Conectar().prepareStatement(query);    // Se ejecuta el comando
            this.rs = ps.executeQuery();                       // Resultado del comando query

            //Se guardan los datos en el objeto preguntos en sus respectivas variables
            while (rs.next()) {
                pr1 = new Preguntas();
                pr1.setNum(this.rs.getInt("Num"));
                pr1.setPregunta(this.rs.getString("Pregunta"));
                pr1.setOpt1(this.rs.getString("Opt1"));
                pr1.setOpt2(this.rs.getString("Opt2"));
                pr1.setOpt3(this.rs.getString("Opt3"));
                pr1.setRes(this.rs.getString("Res"));
                pre3.add(pr1);
            }

            //Se imprime por consola las preguntas del nivel
            System.out.println("Tamaño de la lista: " + pre3.size());
            for (Preguntas p : pre3) {
                System.out.println("Num: " + p.getNum());
                System.out.println("Pregunta: " + p.getPregunta());
                System.out.println("A: " + p.getOpt1());
                System.out.println("B: " + p.getOpt2());
                System.out.println("C: " + p.getOpt3());
                System.out.println("D: " + p.getRes());
                System.out.println("--------------------------------------------");
            }
        } catch (SQLException ex) {
            // Enn caso de tener un error se ejecuta el siguiente conando
            java.util.logging.Logger.getLogger(Niveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } finally {
            //Finalmente se cierra la conexion con MYSQL para liberar recursos de maquina
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (cx != null) {
                    cx.Desconectar();
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }

    //Cargando las preguntas Level 4 en la lista
    public void LoadLevel4() {
        try {

            query = "SELECT * FROM Level4";                      // Comando query mostrar tabla Level1
            this.ps = cx.Conectar().prepareStatement(query);    // Se ejecuta el comando
            this.rs = ps.executeQuery();                       // Resultado del comando query

            //Se guardan los datos en el objeto preguntos en sus respectivas variables
            while (rs.next()) {
                pr1 = new Preguntas();
                pr1.setNum(this.rs.getInt("Num"));
                pr1.setPregunta(this.rs.getString("Pregunta"));
                pr1.setOpt1(this.rs.getString("Opt1"));
                pr1.setOpt2(this.rs.getString("Opt2"));
                pr1.setOpt3(this.rs.getString("Opt3"));
                pr1.setRes(this.rs.getString("Res"));
                pre4.add(pr1);
            }

            //Se imprime por consola las preguntas del nivel
            System.out.println("Tamaño de la lista: " + pre4.size());
            for (Preguntas p : pre4) {
                System.out.println("Num: " + p.getNum());
                System.out.println("Pregunta: " + p.getPregunta());
                System.out.println("A: " + p.getOpt1());
                System.out.println("B: " + p.getOpt2());
                System.out.println("C: " + p.getOpt3());
                System.out.println("D: " + p.getRes());
                System.out.println("--------------------------------------------");
            }
        } catch (SQLException ex) {
            // Enn caso de tener un error se ejecuta el siguiente conando
            java.util.logging.Logger.getLogger(Niveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } finally {
            //Finalmente se cierra la conexion con MYSQL para liberar recursos de maquina
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (cx != null) {
                    cx.Desconectar();
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }

    //Cargando las preguntas Level 5 en la lista
    public void LoadLevel5() {
        try {

            query = "SELECT * FROM Level5";                      // Comando query mostrar tabla Level1
            this.ps = cx.Conectar().prepareStatement(query);    // Se ejecuta el comando
            this.rs = ps.executeQuery();                       // Resultado del comando query

            //Se guardan los datos en el objeto preguntos en sus respectivas variables
            while (rs.next()) {
                pr1 = new Preguntas();
                pr1.setNum(this.rs.getInt("Num"));
                pr1.setPregunta(this.rs.getString("Pregunta"));
                pr1.setOpt1(this.rs.getString("Opt1"));
                pr1.setOpt2(this.rs.getString("Opt2"));
                pr1.setOpt3(this.rs.getString("Opt3"));
                pr1.setRes(this.rs.getString("Res"));
                pre5.add(pr1);
            }

            //Se imprime por consola las preguntas del nivel
            System.out.println("Tamaño de la lista: " + pre5.size());
            for (Preguntas p : pre5) {
                System.out.println("Num: " + p.getNum());
                System.out.println("Pregunta: " + p.getPregunta());
                System.out.println("A: " + p.getOpt1());
                System.out.println("B: " + p.getOpt2());
                System.out.println("C: " + p.getOpt3());
                System.out.println("D: " + p.getRes());
                System.out.println("--------------------------------------------");
            }
        } catch (SQLException ex) {
            // Enn caso de tener un error se ejecuta el siguiente conando
            java.util.logging.Logger.getLogger(Niveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } finally {
            //Finalmente se cierra la conexion con MYSQL para liberar recursos de maquina
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (cx != null) {
                    cx.Desconectar();
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
    
    //Metodos GETTER

    public List<Preguntas> getPre1() {
        return pre1;
    }

    public List<Preguntas> getPre2() {
        return pre2;
    }

    public List<Preguntas> getPre3() {
        return pre3;
    }

    public List<Preguntas> getPre4() {
        return pre4;
    }

    public List<Preguntas> getPre5() {
        return pre5;
    }   
}
