package gennaiolidavidepuntocerchio;

public class Cerchio extends Punto {
    private int raggio;

    public Cerchio(int x, int y, int raggio) {
        super(x, y);
        this.raggio = raggio;
    }
  public void setRaggio(int raggio) {
        this.raggio = raggio;
    }
    public int getRaggio() {
        return raggio;
    }
 /**
  * controlla se il cerchio contiene un punto
  * @param p
  * @return
  */
    public boolean contienePunto(Punto p) {
        int distanzaCentro = this.distanzaAltroPunto(p);
        return distanzaCentro <= raggio;
    }
    /**
     * controlla se due cerchi si intersecano
     * @param altro
     * @return
     */
   public boolean intersecaCerchio(Cerchio altro) {
        int distanzaCentri = this.distanzaAltroPunto(altro);
        return distanzaCentri <= (this.raggio + altro.raggio);
    }
    public String toString() {
        return "Cerchio{centro=(" + x + ", " + y + "), raggio=" + raggio + "}";
    }
}
