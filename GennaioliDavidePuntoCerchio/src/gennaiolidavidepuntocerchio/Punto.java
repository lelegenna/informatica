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
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    
    public int distanzaOrigine(){
        return (int)Math.sqrt(Math.pow(x,2)+Math.pow(y, 2));
    }
    
    public int distanzaAltroPunto(Punto altro) {
        return (int) Math.sqrt(
            Math.pow(this.x - altro.x, 2) +
            Math.pow(this.y - altro.y, 2)
        );
    }
}
