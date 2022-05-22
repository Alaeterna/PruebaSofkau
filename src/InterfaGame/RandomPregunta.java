/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfaGame;

/**
 *
 * @author ASUS
 */

//Selecion Aleatoria de la pregunta
public class RandomPregunta {

    private int RandomNum, a, b, c, d, aux;
    private int NumeAle[] = new int[4];
    
    //Iniciando los valores 
    public RandomPregunta() {
        RandomNum = 0;
    }

    //Escogiendo pregunta aleatorea
    public void AleatoreaPregunta() {
        int cont = 0;
        while (cont <= (int) (Math.random() * 10)) {
            RandomNum = (int) (Math.random() * 5);
            cont++;
        }
        System.out.println(RandomNum);
    }

    //Escoger orden respuestas
    public int[] BotonAleatoreo() {

        aux = (int) (Math.random() * 4);
        NumeAle[0] = aux;
        int cont = 0;
        while (cont <= (int) (Math.random() * 10)) {
            for (int i = 1; i < 4; i++) {
                aux = (int) (Math.random() * 4);
                NumeAle[i] = aux;
                for (int j = 0; j < i; j++) {
                    if (NumeAle[i] == NumeAle[j]) {
                        i--;
                    }
                }
            }
            cont++;
        }
        System.out.println(NumeAle[0]);
        System.out.println(NumeAle[1]);
        System.out.println(NumeAle[2]);
        System.out.println(NumeAle[3]);
        return NumeAle;
    }

    //Insertando GETTER
    public int getRandomNum() {             // ||Obtener valor de RandomNum
        return RandomNum;
    }

    public int getA() {                     // ||Obtener valor de a
        return a;
    }

    public int getB() {                     // ||Obtener valor de b
        return b;
    }

    public int getC() {                     // ||Obtener valor de c
        return c;
    }

    public int getD() {                     // ||Obtener valor de d(Respuesta)
        return d;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setD(int d) {
        this.d = d;
    }
}
