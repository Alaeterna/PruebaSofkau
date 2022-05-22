/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaGame;


/**
 *
 * @author ASUS
 */

//Clase creada para cargar las preguntas de mysql 
public class Preguntas {
    
    int num;
    private String pregunta;
    private String opt1;
    private String opt2;
    private String opt3;
    private String res;
    
    //Contructor que inicializa las variables
    public Preguntas() {
        
        num = 0;
        pregunta = "";
        opt1 = "";
        opt2 = "";
        opt3 = "";
        res = "";
        
    }
    
    
    //SETTER AND GETTER
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

       
}
