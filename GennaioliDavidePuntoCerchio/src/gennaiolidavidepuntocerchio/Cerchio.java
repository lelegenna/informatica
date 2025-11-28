package gennaiolidavidepuntocerchio;

public class Cerchio extends Punto {
    private int raggio;

    public Cerchio(int x, int y, int raggio) {
        super(x, y);
        this.raggio = raggio;
    }

    public int getRaggio() {
        return raggio;
    }

    public boolean contienePunto(Punto p) {
        int distanzaCentro = this.distanzaAltroPunto(p);
        return distanzaCentro <= raggio;
    }
   public boolean intersecaCerchio(Cerchio altro) {
        int distanzaCentri = this.distanzaAltroPunto(altro);
        return distanzaCentri <= (this.raggio + altro.raggio);
    }
}
