/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gennaiolidavideconcessionario;

import java.util.*;

/**
 *
 * @author gennaioli.davide
 */
public class TestAuto {

    public void avvia() {
        Scanner s = new Scanner(System.in);
        Auto[] parco = new Auto[4];
        int saldovendute = 0;
        System.out.println("dammi il nome del concessionario");
        String ragioneSociale = s.nextLine();
        System.out.println("dammi la partita IVA del concessionario");
        String PIVA = s.nextLine();

        Concessionario c = new Concessionario(PIVA, ragioneSociale, parco, saldovendute);
        for (int i = 0; i < parco.length; i++) {
            System.out.println("dammi il modello dell'auto");
            String modello = s.nextLine();
            System.out.println("dammi la marca dell'auto");
            String marca = s.nextLine();
            System.out.println("dammi la targa dell'auto");
            String targa = s.nextLine();
            
            System.out.println("dammi la potenza dell'auto");
            int potenza = s.nextInt();
            System.out.println("dammi la cilindrata dell'auto");
            int cilindrata = s.nextInt();
            System.out.println("dammi i kilometri dell'auto");
            int Km = s.nextInt();
            s.nextLine();
            System.out.println("dammi l'alimentazione dell'auto");
            String alimentazione = s.nextLine();
            s.nextLine();
            System.out.println("dammi il prezzo dell'auto");
            int prezzo = s.nextInt();
           Auto a1=new Auto(targa,marca,modello,alimentazione,cilindrata,Km,potenza,prezzo);
        }
        
    }
}
