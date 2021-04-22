/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alampi.adrian
 */
public class Generatore implements Runnable {

    public String generaNome() {
        String[] listaN = {"Adrian", "Andrea", "Riccardo", "Paolo", "generatoreN"};
        return listaN[(int) (Math.random() * 5)];
    }

    public String generaCognome() {
        String[] listaC = {"Alampi", "Piero", "NonSo", "Vediamo", "generatoreC"};
        return listaC[(int) (Math.random() * 5)];
    }

    public int generaNumero() {
        return (int) (Math.random() * 31);
    }

    @Override
    public void run() {
        int i=0;
        while (true) {
            try {
                Studente s = new Studente(generaNumero(), generaNome(), generaCognome());
                System.out.println("Thread n."+i+ " // "+ s.toString());
                Thread.sleep(1000);
                i++;
            } catch (InterruptedException ex) {
                Logger.getLogger(Generatore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
