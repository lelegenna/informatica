/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gennaiolidavideconcessionario;

import java.util.Objects;

/**
 *
 * @author gennaioli.davide
 */
public class Auto {
    private String targa;
    private String marca;
    private String modello;
    private String alimentazione;
    private int cilindrata;
    private int Km;
    private int potenza;
    private int prezzo;
    
    public Auto(String targa,String marca,String modello,String alimentazione, int cilindrata, int Km ,int potenza,int prezzo)
    {
        this.Km=Km;
        this.cilindrata=cilindrata;
        this.potenza=potenza;
        this.prezzo=prezzo;
        this.alimentazione=alimentazione;
        this.modello=modello;
        this.marca=marca;
        this.targa=targa;
    }
    public Auto()
    {
        this.Km=0;
        this.cilindrata=0;
        this.potenza=0;
        this.prezzo=0;
        this.alimentazione="";
        this.modello="";
        this.marca="";
        this.targa="";
    }
    public String getTarga()
    {
         return targa;
    }
     public int getPrezzo()
    {
         return prezzo;
    }
      public String getModello()
    {
         return modello;
    }
     public int getKm()
    {
         return Km;
    }
      public String getMarca()
    {
         return targa;
    }
     public int getCilindrata()
    {
         return cilindrata;
    }
        public String getAlimentazione()
    {
         return alimentazione;
    }
     public int getPotenza()
    {
         return potenza;
    }
     

  

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Auto other = (Auto) obj;
        return Objects.equals(this.targa, other.targa);
    }
}
