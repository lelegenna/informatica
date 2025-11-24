/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gennaiolidavideconcessionario;

/**
 *
 * @author gennaioli.davide
 */
public class Concessionario {

    private String statoScociale;
    private String PIVA;
    private Auto[] parco;
    private int saldovendute;
    public Concessionario(String statoScociale, String PIVA, Auto[] parco,int saldovendute) {
        this.PIVA = PIVA;
        this.parco = parco;
        this.statoScociale = statoScociale;
        this.saldovendute=saldovendute;
    }

    public int cercaTarga(String targa) {
        int i = 0;
        for (Auto a : parco) {
            i++;
            if (a.getTarga().equalsIgnoreCase(targa)) {
                return i;
            }
        }
        return -1;
    }

    public void vendo(String targa) {
       
        int pos = cercaTarga(targa);

        if (pos > 0 && pos <= parco.length) {
            Auto a = parco[pos - 1];

            if (a != null) {
                saldovendute += a.getPrezzo();
                parco[pos - 1] = null;
            }
        }
        System.out.println(saldovendute);
    }

    public String getStatoScociale() {
        return statoScociale;
    }

    public String getPIVA() {
        return PIVA;
    }

    public Auto[] getParco() {
        return parco;
    }

    public int getSaldovendute() {
        return saldovendute;
    }
    
}
