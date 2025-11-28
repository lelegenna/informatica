/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gennaiolidavidepuntocerchio;

/**
 *
 * @author gennaioli.davide
 */
public class Punto {

    protected int x;
    protected int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }   
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    /**
     * calcola la distanza dall'origine
     * @return
     */
    public int distanzaOrigine(){
        return (int)Math.sqrt(Math.pow(x,2)+Math.pow(y, 2));
    }
    /**
     * calcola la distanza da un altro punto
     * @param altro
     * @return
     */
    public int distanzaAltroPunto(Punto altro) {
        return (int) Math.sqrt(
            Math.pow(this.x - altro.x, 2) +
            Math.pow(this.y - altro.y, 2)
        );
    }
}
